<h3>
  1. Conway’in Kanunu’nu (Conway’s Law) açıklayınız.
</h3>

<p>
  Conway's Law is a theory stating that the software product of any organization is nothing but a replica of communication structure in that organization. In other words, in order to produce a software several engineers must communicate together in a specific structure and in order to optimize the structure of the software the communication structure must be improved.
</p>

<h3>
  2. Software as a Service (SaaS), Platform as a Service (PaaS), Infrastructure as a Service (IaaS), On-Premises kavramlarını örneklerle açıklayınız.
</h3>

<p>
  SaaS, PaaS and IaaS are delivery models of cloud computing systems. Each type depends on the level of management given to the cloud.
  
  <ul>
    <li>
      Infrastructure as a Service: the level at which the service provides all the layers directly related to hardware (servers, network systems, storage, ...etc). <i>Examples: Amazon Web Services EC2 and GoGrid.</i>
  </li>
    <li>
      Platform as a Service: the level at which the service provides all the IaaS services plus the system and configuration required to run the software to be hosted (operating system, middleware and runtime). <i>Examples: Firebase, AWS, and Microsoft Azure.</i>
    </li>
    <li>
      Software as a Service: the level at which the service provides IaaS and PaaS services plus the software itself. <i>Examples: Gmail, Outlook, and Google Drive.</i>
    </li>
    <li>
      On-Premises: is when the whole app is hosted by the producing company without using any cloud services.
    </li>
   
  </ul>
</p>

<h3>
  3. Continuous Integration, Continuous Delivery ve Continuous Deployment
kavramlarını açıklayınız.
</h3>

<p>
  <i>Continuous Integration:</i> a practice developed to avoid conflicts emerging while merging the codes of multiple developers. The practice states that:
  
  <ul>
    <li>A developer must push their code modifications in small batches. Even if the feature is not finished yet. The reason for this is that even if a conflict emerges, solving it would be easier than solving a conflict with a full feature in it. 
    </li>
    <li>
      An automation system must be placed before the merge. The system builds the code and tests it as soon as the developer pushes a new commit, if an error occurs or a test fails then this indicates the developer must solve the problem before their code is merged into the code base.
    </li>
  </ul>
  
  
  <i>Continuous Delivery:</i> This automation process covers all the steps covered by CI with addition to another step, which is delivering the software to production. After CI work is done, the software must be moved from development environment to production environment. In Continuous Delivery this is done with a human factor (Manually).
  
  <i>Continuous Deployment:</i> It covers the same steps covered by Continuous Delivery; however, in the case of Continuous Deployment the decision whether we should move from development environment into production environment is automated.
  
  <img alt="CIntegratoin, CDeployment and CDelivery" src="https://i.stack.imgur.com/yOofB.png" style="width: 60%;"/>
</p>


<h3>
  4. API Gateway pattern’ı açıklayınız.
</h3>

<p>
  API Gateway is a pattern that suggests adding an abstraction layer between the Frontend and the several Backend services. This layer acts as a middleware between the client and the services and forwards the requests coming from the client to the suitable service. 
  
  Advantages:
  <ul>
    <li>Freedom of refactoring and flexibility on the backend side.</li>
    <li>Ability to handle different kinds of clients</li>
    <li>No need for the frontend developers to understand the backend structure.</li>
  </ul>
  
  Disadvantages:
  <ul>
    <li>Overhead execution time because of the added layer</li>
    <li>Developing the API Gateway layer can be time consuming.</li>
  </ul>
</p>


<h3>
  5. Backend for frontend (BFF) pattern’ ı açıklayınız.
</h3>

<p>
  In a classic Frontend/Backend structure, the client side send a request to the backend and the backend in turn returns the data requested. However, an app that runs on multiple operating systems (web, iOS or Android app) might decide to behave differently and thus a request from a web app requires a different from response from that for a mobile app.
  
  Backend For Frontend (BFF) pattern solves this problem by suggesting that each client type should has a special backend service (bff) which acts as a middleware between the client and the general purpose backend services. 
  
  When comparing BFF pattern to the API Gateway pattern, BFF is nothing but an API Gateway pattern with a gateway built for each operating system (client type).
  
  <img alt="backend for frontend pattern explained" src="https://miro.medium.com/max/581/1*Hg4bB1sHypg5IHCXBW8DZA.png" style="width: 35%; height: auto;" />
</p>


<h3>
  6. Circuit-breaker pattern’ ı açıklayınız.
</h3>

<p>
  Circuit-breaker is a concept inspired by the electrical circuit which helps avoiding a problem in one microservice to cause an issue in all the other microservices. 
  
  This is achieved by adding a request interceptor at each microservice which keeps monitoring the number of successful and failing requests and according to a certain threshold the service decides to stop sending requests for a while. After the timeout period has passed the service starts sending requests again and monitor the performance. 
  
  This pattern is good because a latency in the response of one service causes latency in the response of the previous service down the chain. By applying Circuit-breaker pattern the chain is cut early keeping track of the performance of all the services in the architecture.
</p>


<h3>
  7. Microservice chassis pattern’ ı kısaca açıklayınız.
</h3>

<p>
  Microservice chassis is a framework that helps us setup the configuration and problem handling patterns at the beginning of the project; such as, circuit-breaker pattern and API Gateway pattern. 
  
  Microservice chassis pattern is a concept that suggests using a framework that handles the cross-cutting concerns. That is services and components that rely on each other should be handled using a framework, e.g. Spring Boot.
</p>
