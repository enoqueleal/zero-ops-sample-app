# Zero Ops Sample App

Aplicação Spring Boot de exemplo para teste de deploy.

## O que tem aqui

| Rota | Tipo | Descrição                                                                                                                |
|---|---|--------------------------------------------------------------------------------------------------------------------------|
| `GET /` e `GET /home` | Página (Thymeleaf) | Renderiza `templates/public/home.html` — uma landing page simples. |
| `GET /api` | REST | Retorna `{"status": "API is running"}` — endpoint simples para confirmar que o deploy está de pé via `curl`.             |

Sem banco de dados, sem AWS SDK, sem Spring Security — só `spring-boot-starter-web`, `-thymeleaf`, `-validation` e `-actuator`.

## Como rodar

```bash
./mvnw spring-boot:run
```

Por padrão sobe em `http://localhost:8082`.

## Variáveis de ambiente

| Variável | Padrão | Descrição |
|---|---|---|
| `PORT` | `8082` | Porta HTTP em que a aplicação sobe. |
| `LOG_GENERAL_LEVEL` | `INFO` | Nível de log raiz (`root`). |
| `LOG_SPRING_LEVEL` | `INFO` | Nível de log do pacote `org.springframework`. |
| `LOG_ZEROOPS_LEVEL` | `INFO` | Nível de log do pacote `br.com.zeroops`. |
