# SMS Application for NHIA EDI project
This is the source repository for `SMS` application.

## Features
1. Enable impersonation of users
2. Use `Mapstruct` to map from Entity to DTO
3. Enable `Full Text Search` using `ElasticSearch`
4. Add MDC for logging (`log4j2`) - Thread Context
5. Create templates of messages. Templates can have placeholders
6. Send messages using `ajax`
7. When message is sent and user is online, notify user by popup on screen
8. When message is sent and user is offline, notify user by event nofication queue

## Cron
1. Birthday
2. Reminder for renewal