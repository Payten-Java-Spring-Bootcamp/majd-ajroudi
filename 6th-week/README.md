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
