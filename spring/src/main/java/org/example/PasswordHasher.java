package org.example;

import org.springframework.stereotype.Component;
@Component
public class PasswordHasher {
        public String hash(String password) {
            return new StringBuilder(password).reverse().toString();
        }
}
