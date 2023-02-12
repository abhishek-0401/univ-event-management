# University Event Management
- ## Frameworks and Language used
  - #### Spring Boot Framework
  - #### Java language
- ## Data Flow
  - ### Controller
     - ##### _findAllStudents( )_   
     - ##### _findStudentById( )_       
     - ##### _addStudent( )_     
     - ##### _updateDepartment( )_    
     - ##### _deleteStudent( )_       
     - ##### _addEvent( )_
     - ##### _updateEvent( )_
     - ##### _deleteEvent( )_
     - ##### _findByDate( )_
  - ### Service
     - ##### _findAllStudents( )_   
     - ##### _findStudentById( )_       
     - ##### _addStudent( )_     
     - ##### _updateDepartment( )_    
     - ##### _deleteStudent( )_       
     - ##### _addEvent( )_
     - ##### _updateEvent( )_
     - ##### _deleteEvent( )_
     - ##### _findByDate( )_
   - ### Repository
     - ##### _findAll( )_   
     - ##### _findById( )_       
     - ##### _save( )_     
     - ##### _deleteById( )_       
     
- ## Data Structure used 
  - #### ArrayList of type String
- ## Database Used
  - #### H2 console
- ## Poject Summary
  In this project we can perform all the CRUD operations on the list of students and events. We have provided some endpoints and also in this section below we have given our API. Using this API we can perform the operations accordingly
  
  > http://localhost:8080/api/v1/univ-event/management
    - ##### /find-all-students
    - ##### /find-studentById/id/{id}
    - ##### /add-student
    - ##### /update-department/id/{id}
    - ##### /delete-student/studentId/{id}
    - ##### /add-event
    - ##### /update-event/eventId/{eventId}
    - ##### /delete-event/eventId/{eventId}
    - ##### /find-all-event/dated/{dated}
