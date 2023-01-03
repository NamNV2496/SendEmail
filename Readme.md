# send Email through gmail via SMTP

![img_2.png](img/img_2.png)

    // access
    https://myaccount.google.com/security
![img_5.png](img/img_5.png)
create new app password to create password
![img_3.png](img/img_3.png)


![img_6.png](img/img_6.png)
![img_7.png](img/img_7.png)

    // CURL
    curl --location --request GET 'http://localhost:8080/send' \
    --header 'Content-Type: application/json' \
    --data-raw '{
    "recipient": "asfsd",
    "msgBody": "hello",
    "subject": "Test"
    }'

Result

![img.png](img/img.png)
