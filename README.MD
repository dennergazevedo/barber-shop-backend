# Barber Shop
Backend de um Barber Shop apenas para estudo, fortalecimento e expansão dos conhecimentos da Stack **Spring Boot**.

## Start Project
Execute `mvn spring-boot:run` no terminal da pasta para executar o projeto.

## Links úteis
- [Configuração de Ambiente](https://efficient-sloth-d85.notion.site/Curso-de-Java-2408d11bfc3447e980fe9460b6293976)
- [Maven Repository](https://mvnrepository.com/)
- [Spring Initializr](https://start.spring.io/)
- [Console da Database](http://localhost:8080/h2-console/)

## Métodos

### Usuários / Clientes
**Criar usuário**
```markdown
POST /user/
```
```json
{
	"email":  "dennergazevedo@gmail.com",
	"password":  "123456789",
	"name":  "Denner Azevedo",
	"phone":  "(31) 9 7140-2515"
}
```

**Listar usuários**
```markdown
GET /user/
```


### Barbeiros / Profissional
**Criar barbeiro**
```markdown
POST /barber/
```
```json
{
	"email":  "dennergazevedo@gmail.com",
	"password":  "123456789",
	"name":  "Denner Azevedo",
	"phone":  "(31) 9 7140-2515",
	"startIn":  "2014-01-01T10:10:30",
	"endIn":  "2014-01-01T10:10:30",
	"offIn":  "sun"
}
```

**Listar barbeiros**
```markdown
GET /barber/
```

### Serviços
**Criar serviço**
```markdown
POST /service/
```
```json
{
	"name":  "Corte Masculino",
	"price":  40,
	"estimatedIn":  30
}
```

**Listar serviços**
```markdown
GET /service/
```