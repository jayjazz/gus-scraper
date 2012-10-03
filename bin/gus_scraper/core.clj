(ns gus-scraper.core)

(require '[clj-http.client :as client])
(require '(org.danlarkin [json :as json]))


(def gus-site "http://www.stat.gov.pl/bdl/app/dane_podgrup.ajax_getKgpTree")

(defn -main
  "Main for ip-check app"
  [& args]
  (def content (client/get gus-site {:query-params {
                                    "p_id" 481441,
                                    "p_depth" 0, 
                                    "p_par" 0, 
                                    "p_kwart" "N", 
                                    "p_token" 0.4076968093814435}}))
  (def json (json/decode (str content))))
  




