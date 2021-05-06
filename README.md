## 初期設定
```shell
gcloud init # などをしてprojectを設定する
```

## 実行
```shell
# 実行
./gradlew appengineRun
# 停止
./gradlew appengineStop
```

## Deploy
```shell
./gradlew appengineDeploy
```

## 設定Project変更
```
gcloud config set project <your-project-id>
```

## URL確認
```shell
gcloud app browse
```