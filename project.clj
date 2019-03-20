(defproject gnl/ghostwheel.stubs "0.3.7"
  :description "Production stubs for Ghostwheel"
  :url "https://github.com/gnl/ghostwheel.stubs"
  :scm {:name "git"
        :url  "https://github.com/gnl/ghostwheel.stubs"}
  :license {:name "Eclipse Public License"
            :url  "https://choosealicense.com/licenses/epl-2.0/"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :dependencies [[gnl/ghostwheel.unghost "0.3.7"]]
  :profiles {:dev {:dependencies [[org.clojure/clojurescript "1.10.520"]
                                  [org.clojure/clojure "1.10.0"]]}}
  :source-paths ["src"]
  :clean-targets ^{:protect false} ["target" "resources"])

