from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

options = Options()
options.add_argument("--no-sandbox")
options.add_argument("--disable-dev-shm-usage")

driver = webdriver.Chrome(options=options)

driver.get("https://www.google.com")

print("Page Title:", driver.title)

search = driver.find_element(By.NAME, "q")
search.send_keys("Selenium WebDriver Demo")
search.send_keys(Keys.RETURN)

driver.implicitly_wait(5)

print("New Page Title:", driver.title)

input("Press Enter to close...")

driver.quit()

