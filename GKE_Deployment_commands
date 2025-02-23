$ gcloud artifacts repositories create gke-demo-order  --repository-format=docker --location=us-central1 


##Image formate

{LOCATION}-docker.pkg.dev/{PROJECT-ID}/{REPOSITORY}/{IMAGE-NAME}

example : us-central1-docker.pkg.dev/{PROJECT-ID}/gke-demo-order/order-service:v1




$ export GOOGLE_CLOUD_PROJECT=`gcloud config list --format="value(core.project)"`

$ ./mvnw -DskipTests com.google.cloud.tools:jib-maven-plugin:build -Dimage=us-central1-docker.pkg.dev/${GOOGLE_CLOUD_PROJECT}/codelabrepo/hello-java:v1

  mvn com.google.cloud.tools:jib-maven-plugin:build -Dimage=us-central1-docker.pkg.dev/gke-demo-451811/gke-demo-order/order-service:v1
  
  
  
  gcloud auth configure-docker us-central1-docker.pkg.dev
  
  docker run -ti --rm -p 8080:8080 \
  us-central1-docker.pkg.dev/$GOOGLE_CLOUD_PROJECT/gke-demo-order/order-service:v1
  
  ----------------------------------------------------------------------------------------------
  
  gcloud services enable compute.googleapis.com container.googleapis.com
  
  
  gcloud container clusters create gke-demo-cluster \
  --num-nodes 2 \
  --machine-type n1-standard-1 \
  --zone us-central1-c
  
  
  kubectl create deployment order-service --image=us-central1-docker.pkg.dev/$GOOGLE_CLOUD_PROJECT/gke-demo-order/order-service:v1
  
  
  kubectl create service loadbalancer order-service --tcp=8080:8080
  
  kubectl get services
  
  kubectl scale deployment order-service --replicas=3
