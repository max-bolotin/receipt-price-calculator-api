# 🛒 Receipt Price Calculator Api
___
This is the RESTfull Api that receives a URL with a receipt from a grocery store in JSON format. It returns prices for receipt positions taking into account the discount value if present. It is assumed that if the receipt has no unit row, then the number of units is zero. The price is not calculated for such positions, and they are not returned in the response JSON.
___
## Technologies stack:
- Java 11
- Spring Boot 2.5.6
- Spring JPA
- H2 in-memory database
- Lombok
- Swagger
- Maven
- Git
___
## Instructions
1. Start the application running ReceiptPriceCalculatorApiApplication method;
2. Save the data from the external JSON file by visiting the URL http://localhost:8080/items/save or in Swagger http://localhost:8080/swagger-ui/# use method /save
3. Get the response JSON by visiting URL http://localhost:8080/items/get-result or in Swagger use method /get-result
4. Run the tests in ItemRepositoryTest class that confirm the correct calculation of total price including discount 