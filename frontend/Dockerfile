
# build stage
FROM node:20 AS builder
WORKDIR /app
COPY package.json package-lock.json* ./
RUN npm install --legacy-peer-deps
COPY . .
ENV NODE_ENV=production
RUN npm run build

# production stage
FROM nginx:stable-alpine AS production
COPY --from=builder /app/dist /usr/share/nginx/html
COPY nginx/default.conf /etc/nginx/conf.d/default.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
