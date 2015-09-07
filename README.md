# Geb Koans

Geb Koans take you step by step through the basics needed to get started with automated web testing using
[Geb](http://www.gebish.org/) and enough [Spock](https://code.google.com/p/spock/) to get going.

### Usage

./gradlew check

### Proxy

If you are behind a corporate proxy and have trouble downloading the dependencies you need to add proxy settings to JAVA_OPTS

E.g.
export JAVA_OPTS="$JAVA_OPTS -Dhttp.proxyHost=some-proxy-host.com -Dhttp.proxyPort=1234 -Dhttps.proxyHost=some-proxy-host.com -Dhttps.proxyPort=1234"
