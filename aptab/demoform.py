# Importing Selenium WebDriver
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
import time

# Step 1: Set up WebDriver for Chrome (or your preferred browser)
driver = webdriver.Chrome()

# Step 2: Open a demo login page (you can replace this URL with any real form page)
driver.get("https://www.saucedemo.com/")

# Step 3: Find the username and password input fields using their name or ID
username = driver.find_element(By.NAME, "user-name")  # You may have to replace 'username' with the actual field name on the site
password = driver.find_element(By.NAME, "password")  # Replace 'password' with the actual field name

# Step 4: Type values into the input fields
username.send_keys("standard_user")  # A dummy username
password.send_keys("secret_sauce")  # A dummy password

# Step 5: Locate the submit/login button and click it
#submit_button = driver.find_element(By.XPATH, "//button[@type='submit']")  # Example using XPATH
submit_button = driver.find_element(By.NAME, "login-button")  
submit_button.click()

# Step 6: Wait for the new page to load
time.sleep(3)  # Wait for 3 seconds for the next page to load

# Step 7: Extract result (for example, if there’s an element with a success message)
try:
    success_message = driver.find_element(By.ID, "success-message")  # Replace with the actual element's ID
    print(f"Login successful: {success_message.text}")
except:
    print("Login failed or success message not found")

# Step 8: Close the browser after completion
driver.quit()	
