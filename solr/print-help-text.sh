#!/bin/bash -x

bin/solr start -h
bin/solr stop -h
bin/solr restart -h
bin/solr status -h
bin/solr healthcheck -h
bin/solr create -h
bin/solr create_core -h
bin/solr create_collection -h
bin/solr delete -h
bin/solr version -h
bin/solr zk -h
bin/solr auth -h
bin/solr assert -h
