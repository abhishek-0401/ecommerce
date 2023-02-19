# Ecommerce API
- ## Frameworks and Language used
  - #### Spring Boot Framework
  - #### Java language
- ## Data Flow
  - ### Controller
     - ##### _getOrderByOrderId( )_   
     - ##### _getUserByUserId( )_       
     - ##### _getProducts( )_     
     - ##### _deleteProduct( )_    
    
  - ### Service
     - ##### _getOrderByOrderId( )_   -- This function will return all the details of an order.
     - ##### _getUserByUserId( )_     -- This function will return a user corresponding to it's userId.
     - ##### _getProducts( )_         -- This function will fetch all the products from the database depending upon it's category.
     - ##### _deleteProduct( )_       -- This function will delete a product and all it's corresponding orders from the 'tbl_order' table.
     
   - ### Repository
     - ##### _findAll( )_   
     - ##### _findById( )_          
     - ##### _deleteById( )_       
     
- ## Database Used
  - #### H2 console
- ## Project Summary
  In this project we have created 4 models namely;User, Product, Address and Order. We have provided some endpoints and also in this section below we have given our API. Using this API we can perform the operations accordingly.
  
  
  > http://localhost:8080/api/v1/ecom
  
  End Points:
    - ##### /get-order-by-orderid
    - ##### /get-user-by-userid
    - ##### /get-products-by-category
    - ##### /deleteById/productId/{productId} 
    -- Here, while deleting a product by it's Id, we are required to delete it's corresponding order so that there is no vioaltion of data integrity.
    
