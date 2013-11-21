此工程为NetBeans IDE工程，请自行移植到其他IDE



为了安全，涉及密码的东西均已被我修改或者删除。
需要配置的文件：

defaultmail.properties ：定时发送邮件时使用的邮箱（收到邮件再发送，自然是用的收邮件的邮箱）
#Sample defaultmail.properties Begin
user=username@domain.com
pass=123456
#Sample defaultmail.properties End

src/config.properties ：微博API默认配置文件
#Sample src/config.properties Begin
client_ID = 123456789
client_SERCRET = 23423efjsdof9023dddddddddd
redirect_URI = http://apps.weibo.com/oubeichentest #这个应用是我创建的，里面包含获取code代码，用这个才能使用程序中自动获取code的功能
baseURL=https://api.weibo.com/2/
accessTokenURL=https://api.weibo.com/oauth2/access_token
authorizeURL=https://api.weibo.com/oauth2/authorize
rmURL=https://rm.api.weibo.com/2/
#Sample src/config.properties End

src/log4j.properties ：微博API默认配置文件，如果存在应该无需修改

weiboauth.properties：这个也可以自动获取，不过必须先是测试账号
#Sample defaultmail.properties Begin
weibo1=2.007VgwrziQ_yDdddddddddd #weibo1为Task中使用的微博用户名，用于判断使用哪个access_token，和实际的用户名并无关系
#Sample defaultmail.properties End
