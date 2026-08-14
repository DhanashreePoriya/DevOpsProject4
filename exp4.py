from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.keys import Keys

# Set Chrome binary location
options = Options()
options.binary_location = "/opt/google/chrome/google-chrome"

# Start WebDriver
driver = webdriver.Chrome(options=options)

# Open Google
driver.get("https://www.google.com")

# Print page title
print(f"Page title: {driver.title}")

# Find search box
search_box = driver.find_element("name", "q")

# Type query
search_box.send_keys("Selenium WebDriver demo")

# Press Enter
search_box.send_keys(Keys.RETURN)

# Wait for results
driver.implicitly_wait(5)

# Print new title
print(f"New Page title: {driver.title}")

# Close browser
driver.quit()
