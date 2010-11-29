
(ns leinp.core
  (:gen-class)
  (:require [http.async.client ])
  (:use [clj-tagsoup] ))


(println "Hello!")


(let [response (c/GET "http://www.meteoprog.ua/ru/")]
  (c/await response)
  (prn (c/string response))
  
  
  
  
  )
  

