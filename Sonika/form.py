# Importing Selenium WebDriver
from selenium import webdriver
from selenium.webdriver.common.by import By
import time

# Step 1: Set up WebDriver for Chrome
driver = webdriver.Chrome()

# Step 2: Open SauceDemo login page
driver.get("https://www.saucedemo.com/")

# Step 3: Find the username and password input fields
username = driver.find_element(By.NAME, "user-name")
password = driver.find_element(By.NAME, "password")

# Step 4: Type username and password
username.send_keys("standard_user")
password.send_keys("secret_sauce")

# Step 5: Locate the login button and click it
submit_button = driver.find_element(By.NAME, "login-button")
submit_button.click()

# Step 6: Wait for the inventory page to load
time.sleep(3)

# Step 7: Open the menu
menu_button = driver.find_element(By.ID, "react-burger-menu-btn")
menu_button.click()

# Step 8: Wait for the menu to appear
time.sleep(1)

# Step 9: Click the About tab
about_button = driver.find_element(By.ID, "about_sidebar_link")
about_button.click()

# Step 10: Wait for the About page to load
time.sleep(200)

# Step 11: Print current page information
print("Current URL:", driver.current_url)
print("Page title:", driver.title)

# Step 12: Keep browser open until you press Enter
input("Press Enter to close the browser...")

# Step 13: Close the browser
driver.quit()
