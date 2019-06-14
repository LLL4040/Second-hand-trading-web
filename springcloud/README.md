# User guidline

## ����1����IntelliJ IDEA��ʹ��tomcat����

* step1: 
    ������`Eureka`֮���ÿһ�������`application.yml`�����ļ���`defaultZone`��URL��Ϊ`http://localhost:9000/eureka/`
* step2: 
    ����������������еķ���

## ����2����docker����������

* step1: 
    ������`Eureka`֮���ÿһ�������`application.yml`�����ļ���`defaultZone`��URL��Ϊ`http://eureka-server:9000/eureka/`
* step2: 
    ��cmd��cd������������ļ�Ŀ¼�·ֱ�����`mvn clean package -D maven.test.skip=true docker:build`������Ӧ��docker image
* step3: 
    ��docker shell��������������������

```bash
$ docker network create -d bridge cloud
$ docker run -p 9000:9000 -idt --name eureka-server --network cloud lyl4040/Eureka
$ docker run -p 9001:9001 -idt --name provider --network cloud lyl4040/servicedemo
$ docker run -p 9002:9002 -idt --name consumer --network cloud lyl4040/servicehi
```

## ����

* ���� http://localhost:9000 ����ע������
* ���� http://localhost:9001/demo?name=233 ���������߶�(��������)
* ���� http://localhost:9002/hi?name=233 ���������߶�(��������)
* ��������߷���û�����У����������߶˻���ö�·����fallback������ʾ��Ϣ
* ������������������docker����Ҫ��localhost����docker��������ip
