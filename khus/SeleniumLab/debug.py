from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.chrome.service import Service

options = Options()
options.add_argument("--no-sandbox")
options.add_argument("--disable-dev-shm-usage")
options.add_argument("--enable-logging")
options.add_argument("--v=1")

service = Service(log_output="chromedriver.log")

driver = webdriver.Chrome(service=service, options=options)

driver.get("https://www.google.com")

print(driver.title)

input("Press Enter to close...")

driver.quit()

