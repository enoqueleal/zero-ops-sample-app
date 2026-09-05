# Zero Ops Sample App

Aplicação Spring Boot mínima, usada como carga de teste para exercitar o pipeline de build e deploy do **zero-ops** (registro de Application → build via Nixpacks/CodeBuild → push para ECR → deploy em ECS Fargate → exposição via API Gateway). Este projeto é uma cópia do repositório `zero-ops` com toda a implementação da plataforma removida — sobraram apenas dois controllers de exemplo para ter algo real para buildar e servir requisições.

## O que tem aqui

| Rota | Tipo | Descrição |
|---|---|---|
| `GET /` e `GET /home` | Página (Thymeleaf) | Renderiza `templates/public/home.html` — a landing page herdada do `zero-ops`, mantida apenas como conteúdo de exemplo. |
| `GET /api` | REST | Retorna `{"status": "API is running"}` — endpoint simples para confirmar que o deploy está de pé via `curl`. |

Sem banco de dados, sem AWS SDK, sem Spring Security — só `spring-boot-starter-web`, `-thymeleaf`, `-validation` e `-actuator`.

`docs/` e `templates/fragments.html` também vieram junto da cópia do `zero-ops` e não têm nenhuma relação com este app de exemplo; `fragments.html` só é usado pela `home.html` para o layout da landing page.

## Como rodar

```bash
./mvnw spring-boot:run
```

Por padrão sobe em `http://localhost:8082`.

## Variáveis de ambiente

| Variável | Padrão | Descrição |
|---|---|---|
| `PORT` | `8082` | Porta HTTP em que a aplicação sobe. O zero-ops (via Nixpacks) injeta essa variável ao rodar o container — a aplicação já escuta nela por convenção. |
| `LOG_GENERAL_LEVEL` | `INFO` | Nível de log raiz (`root`). |
| `LOG_SPRING_LEVEL` | `INFO` | Nível de log do pacote `org.springframework`. |
| `LOG_ZEROOPS_LEVEL` | `INFO` | Nível de log do pacote `br.com.zeroops`. |
