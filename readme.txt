Load the java project into your editor and you can run the project.
It will ask to enter product name and product value (int) and coin name and coin values.
to exit from data entry you need to enter exit in coin name.

Note1: the logic mainly focused on vending machine coin handling component, and not dealing with 
the product. it doesn't validate the product much and doesn't have stack of the products.

requirement to run this app: Java + maven

To run the app, you can run it through your java Editor (eclipse) or using following command:

mvn exec:java -Dexec.mainClass="challange.vending.App"

This is sample of input and output:

Enter Product Name: cake
Enter Product value: 60
Enter Coin Name or type exit: penny
Enter Coin value: 1
Enter Coin Name or type exit: penny
Enter Coin value: 2
Enter Coin Name or type exit: penny
Enter Coin value: 1
Enter Coin Name or type exit: dime
Enter Coin value: 10
Enter Coin Name or type exit: nickle
Enter Coin value: 5
Enter Coin Name or type exit: quarte
Enter Coin value: 25
Enter Coin Name or type exit: quarter
Enter Coin value: 25
Enter Coin Name or type exit: quarter
Enter Coin value: 25
Enter Coin Name or type exit: exit
invalid coins:--->
penny
nickle
quarte
Product:---->cake
refund Coins:--->
penny
penny