# =====================================
# FDP Registration Application Backend
# Author: Sujata Oak
# Node.js + Express + PostgreSQL
# =====================================

# Use Node.js version 20 as the base image
FROM node:20

#Sets the working directory inside the container to /app
WORKDIR /app

#Copy package.json and package-lock.json
COPY package*.json ./

# Install Node.js dependencies
RUN npm install

# Copy application source code
COPY . .

# Application listens on port 5000
EXPOSE 5000

# Start the Node.js server
CMD ["node","server.js"]
