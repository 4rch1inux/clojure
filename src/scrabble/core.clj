(ns scrabble.core
 (:require [net.cgrand.enlive-html :as html]))

(use 'clojure.java.io)

(def dict
  (with-open [rdr (reader "/home/div/workspace/slownik.txt")]
    (doall (line-seq rdr))))
;(println (take 5 dict))

(println (html/select [:.ktb] 
                      (html/html-resource 
                        (java.net.URL. "http://www.kurnik.pl/stat.phtml?uid=clojure&gid=bb&sk=2"))))