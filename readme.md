API 서버와 JWT  

1. 서버, 클라이언트 개발의 분리    
클라이언트 - 리액트, Vue.js 와 같은 자바스크립트 라이브러리를 이용   
서버 - Ajax를 이용해 REST 방식으로 API를 호출하고 결과를 받아서 처리   

2. REST 방식이란?
    REST(Representational State Transfer)는 웹 서비스 아키텍처의 한 형식으로,   
    자원을 표현하고 상태를 전송하기 위한 경량화된 통신 방식.   
    REST는 클라이언트와 서버 간의 통신을 위한 규칙과 제약 조건을 제공하여 확장성과 성능을 개선.   
    이를 통해 클라이언트와 서버 간의 독립성과 상호 운용성을 향상시킬 수 있음.  

3. REST 주요 개념
    * 자원 (Resource): 웹 서비스를 제공하는 개체로, 각각 고유한 URI(Uniform Resource Identifier)로 식별  
    * 행위 (Verb): 자원에 대해 수행되는 작업을 나타내는 HTTP 메서드. 주요한 HTTP 메서드로는 GET(조회), POST(생성), PUT(수정), DELETE(삭제)  
    * 표현 (Representation): 자원의 상태를 나타내는 데이터. 주로 JSON, XML, HTML 등의 형식으로 표현됩니다.  
4. REST의 주요 특징  
    * Stateless (무상태성): 서버는 클라이언트의 상태를 유지하지 않으며, 각 요청은 독립적으로 처리됩니다. 이는 서버의 확장성과 클라이언트의 부담을 줄여줍니다.  
    * Client-Server 모델: 클라이언트와 서버는 독립적으로 개발될 수 있고, 상호 작용할 수 있습니다. 서버는 비즈니스 로직을 처리하고, 클라이언트는 사용자 인터페이스를 담당합니다.  
    * Uniform Interface (일관된 인터페이스): 클라이언트와 서버 간의 통신을 위한 인터페이스가 일관성을 가지며, 표준 HTTP 메서드와 URI를 사용합니다.  
    * 계층 구조 (Layered System): 서버는 중간 계층(로드 밸런서, 캐시 등)을 사용하여 확장성과 보안성을 개선할 수 있습니다.  