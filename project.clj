(defproject org.clojars.wink/luminus-undertow "0.1.18-2"
  :description "Undertow adapter for Luminus"
  :url "https://github.com/luminus-framework/luminus-undertow"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.11.4"]
                 [org.clojure/tools.logging "1.3.0"]
                 [org.clojars.wink/ring-undertow-adapter "1.3.1-2"]]
  :deploy-repositories [["releases"  {:sign-releases false :url "https://clojars.org/repo"}]
                        ["snapshots" {:sign-releases false :url "https://clojars.org/repo"}]])
