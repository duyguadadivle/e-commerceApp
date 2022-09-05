# Every docker image has to inherit from another image. I also inherited the npm requirement here from the node's image in dockerHub.
FROM node:16.16.0

# I need chrome to run tests on spa projects. Since the node image is actually inherited from the linux image, we can run the commands we ran linux for it here as well. The RUN command in Docker allows us to run shell commands.
RUN wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add -
RUN sh -c 'echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google.list'
RUN apt-get update && apt-get install -yq google-chrome-stable

# I specify the working folder as /app. This command will create a folder named /app in the container that will be created when this image runs for me.
WORKDIR /app

# Here in my project we are mapping node_modules to the /app folder in the container.
ENV PATH /app/node_modules/.bin:$PATH

# I am copying the package.json file from my project into the container.
COPY package.json /app/package.json

# I upload the packages in package.json to the container.
RUN npm install

# I install angular/cli as general on container.
RUN npm install -g @angular/cli@9.0.2 --unsafe

#  I'm copying the project files into the container. -- except in .dockerignore
COPY . /app

# I am serving my project in container.
CMD ng serve --host 0.0.0.0