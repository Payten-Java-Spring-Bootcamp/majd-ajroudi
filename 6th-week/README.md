<h3>
  1. Conway’in Kanunu’nu (Conway’s Law) açıklayınız.
</h3>

<p>
  Conway's Law is a theory stating that the software product of any organization is nothing but a replica of communication structure in that organization. In other words, in order to produce a software several engineers must communicate together in a specific structure and in order to optimize the structure of the software the communication structure must be improved.
</p>


<h3>
  5. Backend for frontend (BFF) pattern’ ı açıklayınız.
</h3>

<p>
  In a classic Frontend/Backend structure, the client side send a request to the backend and the backend in turn returns the data requested. However, an app that runs on multiple operating systems (web, mobile or alexa app) might decide to behave differently and thus a request from a web app requires a different from response from that for a mobile app. 
  
  Backend For Frontend (BFF) pattern solves this problem by suggesting that each client type should has a special backend service (bff) which acts as a middleware between the client and the general purpose backend services. 
  
  <img alt="backend for frontend pattern explained" src="https://miro.medium.com/max/581/1*Hg4bB1sHypg5IHCXBW8DZA.png" style="width: 35%; height: auto;" />
</p>
