# Import Selenium WebDriver
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

# Set up WebDriver (Chrome in this case)
driver = webdriver.Chrome()

# Open Google
driver.get("https://www.google.com")

# Print page title
print(f"Page title: {driver.title}")

# Find the search box element using its name attribute value
search_box = driver.find_element("name", "q")

# Type a query into the search box
search_box.send_keys("flipkart.com")
driver.implicitly_wait(5)

# Simulate pressing Enter
search_box.send_keys(Keys.RETURN)

# Wait for the results page to load and display the results
driver.implicitly_wait(10)

# Print the title of the new page
print(f"New Page title: {driver.title}")

# Close the browser
driver.quit()
