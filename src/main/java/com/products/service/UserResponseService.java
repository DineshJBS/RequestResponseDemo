package com.products.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.products.dto.User;
import com.products.dto.UserResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Service
public class UserResponseService {

   public List<User> getRandomUser(){
       URL url;

       {
           try {
               url = new URL("https://randomuser.me/api/");

               HttpURLConnection connection = (HttpURLConnection) url.openConnection();

               InputStream responseStream = connection.getInputStream();

               ObjectMapper mapper = new ObjectMapper();

               UserResponse userResponse = mapper.readValue(responseStream, UserResponse.class);

               return userResponse.getUsers();


           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }
   }


}
