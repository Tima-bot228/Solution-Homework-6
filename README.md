# Проект SmartHome и TechSupport

## Этот проект — практическая реализация двух популярных шаблонов проектирования на языке Java:

### Chain of Responsibility
### 2. Command 

#### Они часто используются в реальных приложениях: от техподдержки до систем умного дома.

---

##  1: Chain of Responsibility— «TechSupport»

### Что реализовано:
- `FAQBotHandler` — обрабатывает простые вопросы (например, сброс пароля).
- `JuniorSupportHandler` — занимается возвратами и вопросами по оплате.
- `SeniorSupportHandler` — решает серьёзные проблемы (бан аккаунта, потеря данных).

### Example
```text
[FAQBot] Handled password_reset
[JuniorSupport] Handled refund_request
[SeniorSupport] Handled account_ban
[SeniorSupport] Cannot handle unknown_bug — escalate manually.

```
## 2: Command — «SmartHome»
### Что реализовано:
- ` Device ` Light (лампа), Thermostat (термостат).
- ` Command `  TurnOnLightCommand, SetThermostatCommand.
- ` Remote Controller `  SmartHomeRemoteControl, которому можно задать команды и отменить последнее действие.

### Example
``` text
Копировать
Редактировать
[Light] Turning ON
[Thermostat] Setting temperature to 22°C
[Thermostat] Reverting temperature to default 20°C
```