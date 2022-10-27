# Playground (spring)
Production quality Spring boot web service boilerplate for startups.

## Coding (phase 1)

### Rest Controllers
1. Create a barebones Rest Controller with routing (done - [wiki](https://github.com/riteshmahato46/playground/wiki/REST-APIs))
2. Create Error Handling and Exception handling controllers.
3. Create telemetry controllers (done - [wiki](https://github.com/riteshmahato46/playground/wiki/REST-APIs))

### Logging 
1. Integrate slf4j with logback. (done - [wiki](https://github.com/riteshmahato46/playground/wiki/Logging))
2. Integrate a downstream log aggregator for `prod` profile and a `rollingFileAppender` for `dev` and `test` environments.

### NoSQL and SQL Data Stores
1. Implement DAL handlers for Cassandra/MongoDB and PostgreSQL with sample model files.
2. Add DBUnit tests for local system and actual managed instances of the DBs for `prod` profile.

### Caching
1. Integrate in-memory/distributed caching behind a feature flag.

### Add support for websockets
1. Add some APIs (messaging, customer chat) using websockets.

### Event based data streaming (kafka)
1. Implement kafka connector, manager and worker for producing and consuming messages.
2. Add code for managing kafka worker threads using multithreaded queues.
3. Integrate with a managed kafka service from any public cloud for `prod` environment and a yml config to change the connector for local env.
4. DLQ (Dead Letter Queues)

### Security
1. Add HTTPS(TLS) authentication and authorization using `HandlerInterceptors`. (Can use Okta for OIDC).
2. Add role based access control on resources/apis.

### Service Proctection (API)
1. Implement Rate Limiting on Users (# users , # concurrent users, total time of all requests) in a 5 min moving window.
2. Implement Rate Limiting on Resources (CPU, RAM consumed).
The above two will prevent noisy neighbour problems. Feel free to add more service protection methods.

### Exception Handling (done - [wiki](https://github.com/riteshmahato46/playground/wiki/Exception-Handling))
1. Add `ControllerAdvice` and global exception handling.

### Profiling
1. Add tools/scripts for JVM profiling (CPU, RAM, HEAP, Thread dumps, etc)
2. Add code coverage tools. Integrate with build.

### Performance testing
1. Create scripts/tests for benchmarking performance.
2. Create synthetic tests and steps to run the perf tests and generate perf metrics.


-----------
## Infrastructural Add-ons (phase 2)

### Visualization
1. Add support for Grafana or some other open source visualization tool for graphs.
2. Create metric graphs for system usage, api usage, usage tracking, errors for measurement and improvement.

### Monitoring and Alerting
1. Add monitoring (time series) for critical health metric indicators (create api for these).
2. Add failure detection (expressions on above time series that evaluate to a number or boolean)
3. Add support for alerting in case of failures (integrate with PagerDuty/ email)

### HA and Fault Tolerance
1. Add instances to at least 2 different AZs. DB should have a hot standby
2. Read DB (follower) for High Read throughput.
2. Add a failover region with a replica db.

### Disaster Recovery
1. DB backups for point in time (RPO - Recovery point objective) - (how much data can I lose?)
2. DB prod ready ASAP (RTO - Recovery time objective) - (how long can I be down?)

### Kubernetes support
1. Add docker and kubernetes support.
2. Add helm-charts.

### Continous Integration (CI)/ Continous deployment (CD)
1. Integrate Jenkins (aws/digitalOcean, etc).
2. Add a deployment pipeline

### User Interface
1. Add a suitable UI codebase (React,etc) and create a boilerplate UI that can be hosted in a cdn.
2. Integrate the UI cdn endpoint with the `HomeController`.

### Documentation/ Bug Tracking
1. Integrate with confluence/docusauraus or any other open source documentation framework for the project.
2. Integrate JIRA/ASANA/github/ some other tool for bug/feature tracking.
3. Add architecture diagrams and design docs.
