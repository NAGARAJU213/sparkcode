val spark = SparkSession.builder.appName("lab01").master("local(*)").getOrCreate()

val df = spark.read.format("csv").load("/home/hduser/hive/data/txns").toDF

df.show()
