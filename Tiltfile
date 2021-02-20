# -*- mode: Python -*-

SERVICE_NAME = "users-in-mem-app"
local_resource(SERVICE_NAME + '-compile',
               'mvn clean install -Dmaven.test.skip=true',
               deps=['src', 'pom.xml'])

docker_build('shpboris/usersmemrestserver', '.')

k8s_yaml('deployment/namespace.yml')
k8s_yaml('deployment/deployment-env1.yml')
k8s_yaml('deployment/deployment-env2.yml')
k8s_yaml('deployment/gateway.yml')
k8s_yaml('deployment/virtual-service.yml')

k8s_resource('my-env1-dpl', port_forwards=4444)
k8s_resource('my-env2-dpl', port_forwards=5555)
