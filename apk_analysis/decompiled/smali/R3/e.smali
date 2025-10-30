.class public final LR3/e;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "SourceFile"

# interfaces
.implements Lk4/O;


# static fields
.field public static final b:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/regex/Pattern;

.field public static final d:Ljava/util/regex/Pattern;

.field public static final e:[I


# instance fields
.field public final a:Lorg/xmlpull/v1/XmlPullParserFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "(\\d+)(?:/(\\d+))?"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LR3/e;->b:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const-string v0, "CC([1-4])=.*"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LR3/e;->c:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    const-string v0, "([1-9]|[1-5][0-9]|6[0-3])=.*"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LR3/e;->d:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const/16 v0, 0x15

    .line 26
    .line 27
    new-array v0, v0, [I

    .line 28
    .line 29
    fill-array-data v0, :array_0

    .line 30
    .line 31
    .line 32
    sput-object v0, LR3/e;->e:[I

    .line 33
    .line 34
    return-void

    .line 35
    :array_0
    .array-data 4
        -0x1
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x8
        0x2
        0x3
        0x4
        0x7
        0x8
        0x18
        0x8
        0xc
        0xa
        0xc
        0xe
        0xc
        0xe
    .end array-data
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LR3/e;->a:Lorg/xmlpull/v1/XmlPullParserFactory;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    return-void

    .line 11
    :catch_0
    move-exception v0

    .line 12
    new-instance v1, Ljava/lang/RuntimeException;

    .line 13
    .line 14
    const-string v2, "Couldn\'t create XmlPullParserFactory instance"

    .line 15
    .line 16
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw v1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static a(Ljava/util/ArrayList;JJIJ)J
    .locals 2

    .line 1
    if-ltz p5, :cond_0

    .line 2
    .line 3
    add-int/lit8 p5, p5, 0x1

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sub-long/2addr p6, p1

    .line 7
    sget p5, Ll4/y;->a:I

    .line 8
    .line 9
    add-long/2addr p6, p3

    .line 10
    const-wide/16 v0, 0x1

    .line 11
    .line 12
    sub-long/2addr p6, v0

    .line 13
    div-long/2addr p6, p3

    .line 14
    long-to-int p5, p6

    .line 15
    :goto_0
    const/4 p6, 0x0

    .line 16
    :goto_1
    if-ge p6, p5, :cond_1

    .line 17
    .line 18
    new-instance p7, LR3/q;

    .line 19
    .line 20
    invoke-direct {p7, p1, p2, p3, p4}, LR3/q;-><init>(JJ)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    add-long/2addr p1, p3

    .line 27
    add-int/lit8 p6, p6, 0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    return-wide p1
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method

.method public static b(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 4

    .line 1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    :cond_0
    :goto_0
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-ne v2, v1, :cond_1

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x3

    .line 28
    if-ne v2, v3, :cond_0

    .line 29
    .line 30
    add-int/lit8 v0, v0, -0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static c(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 10

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x2

    .line 5
    const/4 v4, 0x1

    .line 6
    const/4 v5, -0x1

    .line 7
    const/4 v6, 0x0

    .line 8
    const-string v7, "schemeIdUri"

    .line 9
    .line 10
    invoke-interface {p0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    if-nez v7, :cond_0

    .line 15
    .line 16
    move-object v7, v6

    .line 17
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-string v8, "value"

    .line 21
    .line 22
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    sparse-switch v9, :sswitch_data_0

    .line 27
    .line 28
    .line 29
    :goto_0
    move v7, v5

    .line 30
    goto :goto_1

    .line 31
    :sswitch_0
    const-string v9, "urn:dolby:dash:audio_channel_configuration:2011"

    .line 32
    .line 33
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-nez v7, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v7, v0

    .line 41
    goto :goto_1

    .line 42
    :sswitch_1
    const-string v9, "tag:dts.com,2018:uhd:audio_channel_configuration"

    .line 43
    .line 44
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-nez v7, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const/4 v7, 0x5

    .line 52
    goto :goto_1

    .line 53
    :sswitch_2
    const-string v9, "tag:dts.com,2014:dash:audio_channel_configuration:2012"

    .line 54
    .line 55
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-nez v7, :cond_3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const/4 v7, 0x4

    .line 63
    goto :goto_1

    .line 64
    :sswitch_3
    const-string v9, "urn:mpeg:mpegB:cicp:ChannelConfiguration"

    .line 65
    .line 66
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-nez v7, :cond_4

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    move v7, v1

    .line 74
    goto :goto_1

    .line 75
    :sswitch_4
    const-string v9, "tag:dolby.com,2014:dash:audio_channel_configuration:2011"

    .line 76
    .line 77
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-nez v7, :cond_5

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    move v7, v3

    .line 85
    goto :goto_1

    .line 86
    :sswitch_5
    const-string v9, "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"

    .line 87
    .line 88
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-nez v7, :cond_6

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_6
    move v7, v4

    .line 96
    goto :goto_1

    .line 97
    :sswitch_6
    const-string v9, "urn:dts:dash:audio_channel_configuration:2012"

    .line 98
    .line 99
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-nez v7, :cond_7

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_7
    move v7, v2

    .line 107
    :goto_1
    packed-switch v7, :pswitch_data_0

    .line 108
    .line 109
    .line 110
    goto/16 :goto_8

    .line 111
    .line 112
    :pswitch_0
    invoke-interface {p0, v6, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-nez v0, :cond_8

    .line 117
    .line 118
    goto/16 :goto_8

    .line 119
    .line 120
    :cond_8
    const/16 v1, 0x10

    .line 121
    .line 122
    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_f

    .line 131
    .line 132
    goto/16 :goto_8

    .line 133
    .line 134
    :pswitch_1
    invoke-interface {p0, v6, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-nez v0, :cond_9

    .line 139
    .line 140
    move v0, v5

    .line 141
    goto :goto_2

    .line 142
    :cond_9
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    :goto_2
    if-ltz v0, :cond_12

    .line 147
    .line 148
    sget-object v1, LR3/e;->e:[I

    .line 149
    .line 150
    array-length v2, v1

    .line 151
    if-ge v0, v2, :cond_12

    .line 152
    .line 153
    aget v5, v1, v0

    .line 154
    .line 155
    goto/16 :goto_8

    .line 156
    .line 157
    :pswitch_2
    invoke-interface {p0, v6, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    if-nez v6, :cond_a

    .line 162
    .line 163
    :goto_3
    move v0, v5

    .line 164
    goto :goto_6

    .line 165
    :cond_a
    invoke-static {v6}, LB6/u0;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    sparse-switch v7, :sswitch_data_1

    .line 177
    .line 178
    .line 179
    :goto_4
    move v1, v5

    .line 180
    goto :goto_5

    .line 181
    :sswitch_7
    const-string v2, "fa01"

    .line 182
    .line 183
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-nez v2, :cond_e

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :sswitch_8
    const-string v1, "f801"

    .line 191
    .line 192
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-nez v1, :cond_b

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_b
    move v1, v3

    .line 200
    goto :goto_5

    .line 201
    :sswitch_9
    const-string v1, "a000"

    .line 202
    .line 203
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-nez v1, :cond_c

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_c
    move v1, v4

    .line 211
    goto :goto_5

    .line 212
    :sswitch_a
    const-string v1, "4000"

    .line 213
    .line 214
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-nez v1, :cond_d

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_d
    move v1, v2

    .line 222
    :cond_e
    :goto_5
    packed-switch v1, :pswitch_data_1

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :pswitch_3
    const/16 v0, 0x8

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :pswitch_4
    move v0, v3

    .line 230
    goto :goto_6

    .line 231
    :pswitch_5
    move v0, v4

    .line 232
    :cond_f
    :goto_6
    :pswitch_6
    move v5, v0

    .line 233
    goto :goto_8

    .line 234
    :pswitch_7
    invoke-interface {p0, v6, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    if-nez v0, :cond_10

    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_10
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    goto :goto_8

    .line 246
    :pswitch_8
    invoke-interface {p0, v6, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    if-nez v0, :cond_11

    .line 251
    .line 252
    move v0, v5

    .line 253
    goto :goto_7

    .line 254
    :cond_11
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    :goto_7
    if-lez v0, :cond_12

    .line 259
    .line 260
    const/16 v1, 0x21

    .line 261
    .line 262
    if-ge v0, v1, :cond_12

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_12
    :goto_8
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 266
    .line 267
    .line 268
    const-string v0, "AudioChannelConfiguration"

    .line 269
    .line 270
    invoke-static {p0, v0}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_12

    .line 275
    .line 276
    return v5

    .line 277
    :sswitch_data_0
    .sparse-switch
        -0x7ee09c90 -> :sswitch_6
        -0x50a2db6e -> :sswitch_5
        -0x43d6a909 -> :sswitch_4
        -0x3aced4cf -> :sswitch_3
        -0x4b58cf3 -> :sswitch_2
        0x129b7989 -> :sswitch_1
        0x79657164 -> :sswitch_0
    .end sparse-switch

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_2
        :pswitch_1
        :pswitch_8
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    :sswitch_data_1
    .sparse-switch
        0x185d7c -> :sswitch_a
        0x2cd22f -> :sswitch_9
        0x2f3613 -> :sswitch_8
        0x2fcffc -> :sswitch_7
    .end sparse-switch

    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_3
    .end packed-switch
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method

.method public static d(Lorg/xmlpull/v1/XmlPullParser;J)J
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "availabilityTimeOffset"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-wide p1

    .line 11
    :cond_0
    const-string p1, "INF"

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const-wide p0, 0x7fffffffffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    return-wide p0

    .line 25
    :cond_1
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    const p1, 0x49742400    # 1000000.0f

    .line 30
    .line 31
    .line 32
    mul-float/2addr p0, p1

    .line 33
    float-to-long p0, p0

    .line 34
    return-wide p0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public static e(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "dvb:priority"

    .line 4
    .line 5
    invoke-interface {p0, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-eqz p2, :cond_1

    .line 18
    .line 19
    move v2, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/high16 v2, -0x80000000

    .line 22
    .line 23
    :goto_0
    const-string v4, "dvb:weight"

    .line 24
    .line 25
    invoke-interface {p0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v4, v3

    .line 37
    :goto_1
    const-string v5, "serviceLocation"

    .line 38
    .line 39
    invoke-interface {p0, v1, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v5, ""

    .line 44
    .line 45
    :cond_3
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 46
    .line 47
    .line 48
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    const/4 v7, 0x4

    .line 53
    if-ne v6, v7, :cond_4

    .line 54
    .line 55
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    goto :goto_2

    .line 60
    :cond_4
    invoke-static {p0}, LR3/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    const-string v6, "BaseURL"

    .line 64
    .line 65
    invoke-static {p0, v6}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_3

    .line 70
    .line 71
    if-eqz v5, :cond_6

    .line 72
    .line 73
    invoke-static {v5}, Ll4/a;->z(Ljava/lang/String;)[I

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    aget p0, p0, v0

    .line 78
    .line 79
    const/4 v6, -0x1

    .line 80
    if-eq p0, v6, :cond_6

    .line 81
    .line 82
    if-nez v1, :cond_5

    .line 83
    .line 84
    move-object v1, v5

    .line 85
    :cond_5
    new-instance p0, LR3/b;

    .line 86
    .line 87
    invoke-direct {p0, v5, v2, v4, v1}, LR3/b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    new-array p1, v3, [LR3/b;

    .line 91
    .line 92
    aput-object p0, p1, v0

    .line 93
    .line 94
    invoke-static {p1}, LP5/q;->n([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :cond_6
    new-instance p0, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-ge v0, v6, :cond_9

    .line 109
    .line 110
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    check-cast v6, LR3/b;

    .line 115
    .line 116
    iget-object v7, v6, LR3/b;->a:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v7, v5}, Ll4/a;->L(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    if-nez v1, :cond_7

    .line 123
    .line 124
    move-object v8, v7

    .line 125
    goto :goto_4

    .line 126
    :cond_7
    move-object v8, v1

    .line 127
    :goto_4
    if-eqz p2, :cond_8

    .line 128
    .line 129
    iget v2, v6, LR3/b;->c:I

    .line 130
    .line 131
    iget v4, v6, LR3/b;->d:I

    .line 132
    .line 133
    iget-object v8, v6, LR3/b;->b:Ljava/lang/String;

    .line 134
    .line 135
    :cond_8
    new-instance v6, LR3/b;

    .line 136
    .line 137
    invoke-direct {v6, v7, v2, v4, v8}, LR3/b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    add-int/2addr v0, v3

    .line 144
    goto :goto_3

    .line 145
    :cond_9
    return-object p0
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
.end method

.method public static f(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;
    .locals 14

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const-string v3, "schemeIdUri"

    .line 5
    .line 6
    invoke-interface {p0, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const/4 v4, -0x1

    .line 11
    const/16 v5, 0x3a

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    if-eqz v3, :cond_9

    .line 15
    .line 16
    invoke-static {v3}, LB6/u0;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    sparse-switch v7, :sswitch_data_0

    .line 28
    .line 29
    .line 30
    :goto_0
    move v3, v4

    .line 31
    goto :goto_1

    .line 32
    :sswitch_0
    const-string v7, "urn:mpeg:dash:mp4protection:2011"

    .line 33
    .line 34
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v3, 0x3

    .line 42
    goto :goto_1

    .line 43
    :sswitch_1
    const-string v7, "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"

    .line 44
    .line 45
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move v3, v0

    .line 53
    goto :goto_1

    .line 54
    :sswitch_2
    const-string v7, "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"

    .line 55
    .line 56
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v3, v1

    .line 64
    goto :goto_1

    .line 65
    :sswitch_3
    const-string v7, "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"

    .line 66
    .line 67
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-nez v3, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    move v3, v6

    .line 75
    :goto_1
    packed-switch v3, :pswitch_data_0

    .line 76
    .line 77
    .line 78
    goto/16 :goto_9

    .line 79
    .line 80
    :pswitch_0
    const-string v3, "value"

    .line 81
    .line 82
    invoke-interface {p0, v2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    move v8, v6

    .line 91
    :goto_2
    if-ge v8, v7, :cond_6

    .line 92
    .line 93
    invoke-interface {p0, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    invoke-virtual {v9, v5}, Ljava/lang/String;->indexOf(I)I

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    if-ne v10, v4, :cond_4

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    add-int/2addr v10, v1

    .line 105
    invoke-virtual {v9, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    :goto_3
    const-string v10, "default_KID"

    .line 110
    .line 111
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    if-eqz v9, :cond_5

    .line 116
    .line 117
    invoke-interface {p0, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    goto :goto_4

    .line 122
    :cond_5
    add-int/2addr v8, v1

    .line 123
    goto :goto_2

    .line 124
    :cond_6
    move-object v7, v2

    .line 125
    :goto_4
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-nez v8, :cond_8

    .line 130
    .line 131
    const-string v8, "00000000-0000-0000-0000-000000000000"

    .line 132
    .line 133
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-nez v8, :cond_8

    .line 138
    .line 139
    const-string v8, "\\s+"

    .line 140
    .line 141
    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    array-length v8, v7

    .line 146
    new-array v8, v8, [Ljava/util/UUID;

    .line 147
    .line 148
    move v9, v6

    .line 149
    :goto_5
    array-length v10, v7

    .line 150
    if-ge v9, v10, :cond_7

    .line 151
    .line 152
    aget-object v10, v7, v9

    .line 153
    .line 154
    invoke-static {v10}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    aput-object v10, v8, v9

    .line 159
    .line 160
    add-int/2addr v9, v1

    .line 161
    goto :goto_5

    .line 162
    :cond_7
    sget-object v7, Lj3/g;->b:Ljava/util/UUID;

    .line 163
    .line 164
    invoke-static {v7, v8, v2}, Ly3/j;->a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    move-object v9, v2

    .line 169
    goto :goto_a

    .line 170
    :cond_8
    move-object v7, v2

    .line 171
    :goto_6
    move-object v8, v7

    .line 172
    :goto_7
    move-object v9, v8

    .line 173
    goto :goto_a

    .line 174
    :pswitch_1
    sget-object v7, Lj3/g;->d:Ljava/util/UUID;

    .line 175
    .line 176
    :goto_8
    move-object v3, v2

    .line 177
    move-object v8, v3

    .line 178
    goto :goto_7

    .line 179
    :pswitch_2
    sget-object v7, Lj3/g;->e:Ljava/util/UUID;

    .line 180
    .line 181
    goto :goto_8

    .line 182
    :pswitch_3
    sget-object v7, Lj3/g;->c:Ljava/util/UUID;

    .line 183
    .line 184
    goto :goto_8

    .line 185
    :cond_9
    :goto_9
    move-object v3, v2

    .line 186
    move-object v7, v3

    .line 187
    goto :goto_6

    .line 188
    :cond_a
    :goto_a
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 189
    .line 190
    .line 191
    const-string v10, "clearkey:Laurl"

    .line 192
    .line 193
    invoke-static {p0, v10}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    const/4 v11, 0x4

    .line 198
    if-eqz v10, :cond_b

    .line 199
    .line 200
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 201
    .line 202
    .line 203
    move-result v10

    .line 204
    if-ne v10, v11, :cond_b

    .line 205
    .line 206
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    goto/16 :goto_d

    .line 211
    .line 212
    :cond_b
    const-string v10, "ms:laurl"

    .line 213
    .line 214
    invoke-static {p0, v10}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v10

    .line 218
    if-eqz v10, :cond_c

    .line 219
    .line 220
    const-string v9, "licenseUrl"

    .line 221
    .line 222
    invoke-interface {p0, v2, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    goto/16 :goto_d

    .line 227
    .line 228
    :cond_c
    if-nez v8, :cond_10

    .line 229
    .line 230
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    if-ne v10, v0, :cond_10

    .line 235
    .line 236
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    invoke-virtual {v10, v5}, Ljava/lang/String;->indexOf(I)I

    .line 241
    .line 242
    .line 243
    move-result v12

    .line 244
    if-ne v12, v4, :cond_d

    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_d
    add-int/2addr v12, v1

    .line 248
    invoke-virtual {v10, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v10

    .line 252
    :goto_b
    const-string v12, "pssh"

    .line 253
    .line 254
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v10

    .line 258
    if-eqz v10, :cond_10

    .line 259
    .line 260
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 261
    .line 262
    .line 263
    move-result v10

    .line 264
    if-ne v10, v11, :cond_10

    .line 265
    .line 266
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    invoke-static {v7, v6}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    invoke-static {v7}, Ly3/j;->e([B)LA3/E;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    if-nez v8, :cond_e

    .line 279
    .line 280
    move-object v8, v2

    .line 281
    goto :goto_c

    .line 282
    :cond_e
    iget-object v8, v8, LA3/E;->c:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v8, Ljava/util/UUID;

    .line 285
    .line 286
    :goto_c
    if-nez v8, :cond_f

    .line 287
    .line 288
    const-string v7, "MpdParser"

    .line 289
    .line 290
    const-string v10, "Skipping malformed cenc:pssh data"

    .line 291
    .line 292
    invoke-static {v7, v10}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    move-object v7, v8

    .line 296
    move-object v8, v2

    .line 297
    goto :goto_d

    .line 298
    :cond_f
    move-object v13, v8

    .line 299
    move-object v8, v7

    .line 300
    move-object v7, v13

    .line 301
    goto :goto_d

    .line 302
    :cond_10
    if-nez v8, :cond_11

    .line 303
    .line 304
    sget-object v10, Lj3/g;->e:Ljava/util/UUID;

    .line 305
    .line 306
    invoke-virtual {v10, v7}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v12

    .line 310
    if-eqz v12, :cond_11

    .line 311
    .line 312
    const-string v12, "mspr:pro"

    .line 313
    .line 314
    invoke-static {p0, v12}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 315
    .line 316
    .line 317
    move-result v12

    .line 318
    if-eqz v12, :cond_11

    .line 319
    .line 320
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 321
    .line 322
    .line 323
    move-result v12

    .line 324
    if-ne v12, v11, :cond_11

    .line 325
    .line 326
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v8

    .line 330
    invoke-static {v8, v6}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    invoke-static {v10, v2, v8}, Ly3/j;->a(Ljava/util/UUID;[Ljava/util/UUID;[B)[B

    .line 335
    .line 336
    .line 337
    move-result-object v8

    .line 338
    goto :goto_d

    .line 339
    :cond_11
    invoke-static {p0}, LR3/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 340
    .line 341
    .line 342
    :goto_d
    const-string v10, "ContentProtection"

    .line 343
    .line 344
    invoke-static {p0, v10}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 345
    .line 346
    .line 347
    move-result v10

    .line 348
    if-eqz v10, :cond_a

    .line 349
    .line 350
    if-eqz v7, :cond_12

    .line 351
    .line 352
    new-instance v2, Ln3/f;

    .line 353
    .line 354
    const-string p0, "video/mp4"

    .line 355
    .line 356
    invoke-direct {v2, v7, v9, p0, v8}, Ln3/f;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 357
    .line 358
    .line 359
    :cond_12
    invoke-static {v3, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    return-object p0

    .line 364
    nop

    .line 365
    :sswitch_data_0
    .sparse-switch
        -0x7610741f -> :sswitch_3
        0x1d2c5beb -> :sswitch_2
        0x2d06c692 -> :sswitch_1
        0x6c0c9d2a -> :sswitch_0
    .end sparse-switch

    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method

.method public static g(Lorg/xmlpull/v1/XmlPullParser;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "contentType"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "audio"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_1
    const-string v0, "video"

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x2

    .line 34
    return p0

    .line 35
    :cond_2
    const-string v0, "text"

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_3

    .line 42
    .line 43
    const/4 p0, 0x3

    .line 44
    return p0

    .line 45
    :cond_3
    :goto_0
    const/4 p0, -0x1

    .line 46
    return p0
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public static h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LR3/f;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "schemeIdUri"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    :cond_0
    const-string v2, "value"

    .line 13
    .line 14
    invoke-interface {p0, v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    move-object v2, v0

    .line 21
    :cond_1
    const-string v3, "id"

    .line 22
    .line 23
    invoke-interface {p0, v0, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-nez v3, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move-object v0, v3

    .line 31
    :cond_3
    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 32
    .line 33
    .line 34
    invoke-static {p0, p1}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    new-instance p0, LR3/f;

    .line 41
    .line 42
    invoke-direct {p0, v1, v2, v0}, LR3/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object p0
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public static i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-wide p2

    .line 9
    :cond_0
    sget-object p1, Ll4/y;->h:Ljava/util/regex/Pattern;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    const-wide v2, 0x40ac200000000000L    # 3600.0

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    if-eqz p2, :cond_8

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    invoke-virtual {p1, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    const/4 p2, 0x3

    .line 41
    invoke-virtual {p1, p2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const-wide/16 v4, 0x0

    .line 46
    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    invoke-static {p2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 50
    .line 51
    .line 52
    move-result-wide p2

    .line 53
    const-wide v6, 0x417e1852c0000000L    # 3.1556908E7

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    mul-double/2addr p2, v6

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move-wide p2, v4

    .line 61
    :goto_0
    const/4 v6, 0x5

    .line 62
    invoke-virtual {p1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-eqz v6, :cond_2

    .line 67
    .line 68
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 69
    .line 70
    .line 71
    move-result-wide v6

    .line 72
    const-wide v8, 0x4144103580000000L    # 2629739.0

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    mul-double/2addr v6, v8

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    move-wide v6, v4

    .line 80
    :goto_1
    add-double/2addr p2, v6

    .line 81
    const/4 v6, 0x7

    .line 82
    invoke-virtual {p1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    if-eqz v6, :cond_3

    .line 87
    .line 88
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 89
    .line 90
    .line 91
    move-result-wide v6

    .line 92
    const-wide v8, 0x40f5180000000000L    # 86400.0

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    mul-double/2addr v6, v8

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    move-wide v6, v4

    .line 100
    :goto_2
    add-double/2addr p2, v6

    .line 101
    const/16 v6, 0xa

    .line 102
    .line 103
    invoke-virtual {p1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    if-eqz v6, :cond_4

    .line 108
    .line 109
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 110
    .line 111
    .line 112
    move-result-wide v6

    .line 113
    mul-double/2addr v6, v2

    .line 114
    goto :goto_3

    .line 115
    :cond_4
    move-wide v6, v4

    .line 116
    :goto_3
    add-double/2addr p2, v6

    .line 117
    const/16 v2, 0xc

    .line 118
    .line 119
    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 126
    .line 127
    .line 128
    move-result-wide v2

    .line 129
    const-wide/high16 v6, 0x404e000000000000L    # 60.0

    .line 130
    .line 131
    mul-double/2addr v2, v6

    .line 132
    goto :goto_4

    .line 133
    :cond_5
    move-wide v2, v4

    .line 134
    :goto_4
    add-double/2addr p2, v2

    .line 135
    const/16 v2, 0xe

    .line 136
    .line 137
    invoke-virtual {p1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-eqz p1, :cond_6

    .line 142
    .line 143
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 144
    .line 145
    .line 146
    move-result-wide v4

    .line 147
    :cond_6
    add-double/2addr p2, v4

    .line 148
    mul-double/2addr p2, v0

    .line 149
    double-to-long p1, p2

    .line 150
    if-nez p0, :cond_7

    .line 151
    .line 152
    neg-long p0, p1

    .line 153
    return-wide p0

    .line 154
    :cond_7
    return-wide p1

    .line 155
    :cond_8
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 156
    .line 157
    .line 158
    move-result-wide p0

    .line 159
    mul-double/2addr p0, v2

    .line 160
    mul-double/2addr p0, v0

    .line 161
    double-to-long p0, p0

    .line 162
    return-wide p0
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
.end method

.method public static j(Lorg/xmlpull/v1/XmlPullParser;F)F
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "frameRate"

    .line 3
    .line 4
    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    sget-object v0, LR3/e;->b:Ljava/util/regex/Pattern;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    int-to-float p1, p1

    .line 43
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    int-to-float p0, p0

    .line 48
    div-float/2addr p1, p0

    .line 49
    return p1

    .line 50
    :cond_0
    int-to-float p0, p1

    .line 51
    return p0

    .line 52
    :cond_1
    return p1
.end method

.method public static l(Lorg/xmlpull/v1/XmlPullParser;Landroid/net/Uri;)LR3/c;
    .locals 151

    move-object/from16 v0, p0

    const/4 v12, 0x1

    const/4 v1, 0x0

    .line 1
    new-array v2, v1, [Ljava/lang/String;

    .line 2
    const-string v3, "profiles"

    const/4 v4, 0x0

    invoke-interface {v0, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    const-string v2, ","

    invoke-virtual {v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 4
    :goto_0
    array-length v3, v2

    move v5, v1

    :goto_1
    if-ge v5, v3, :cond_2

    aget-object v6, v2, v5

    .line 5
    const-string v7, "urn:dvb:dash:profile:dvb-dash:"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v2, v12

    goto :goto_2

    :cond_1
    add-int/2addr v5, v12

    goto :goto_1

    :cond_2
    move v2, v1

    .line 6
    :goto_2
    const-string v3, "availabilityStartTime"

    invoke-interface {v0, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v3, :cond_3

    move-wide/from16 v17, v5

    goto :goto_3

    .line 7
    :cond_3
    invoke-static {v3}, Ll4/y;->K(Ljava/lang/String;)J

    move-result-wide v7

    move-wide/from16 v17, v7

    .line 8
    :goto_3
    const-string v3, "mediaPresentationDuration"

    invoke-static {v0, v3, v5, v6}, LR3/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v19

    .line 9
    const-string v3, "minBufferTime"

    invoke-static {v0, v3, v5, v6}, LR3/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v21

    .line 10
    const-string v3, "type"

    invoke-interface {v0, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 11
    const-string v7, "dynamic"

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_4

    .line 12
    const-string v3, "minimumUpdatePeriod"

    invoke-static {v0, v3, v5, v6}, LR3/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v7

    move-wide/from16 v24, v7

    goto :goto_4

    :cond_4
    move-wide/from16 v24, v5

    :goto_4
    if-eqz v23, :cond_5

    .line 13
    const-string v3, "timeShiftBufferDepth"

    invoke-static {v0, v3, v5, v6}, LR3/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v7

    move-wide v10, v7

    goto :goto_5

    :cond_5
    move-wide v10, v5

    :goto_5
    if-eqz v23, :cond_6

    .line 14
    const-string v3, "suggestedPresentationDelay"

    invoke-static {v0, v3, v5, v6}, LR3/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v7

    move-wide/from16 v28, v7

    goto :goto_6

    :cond_6
    move-wide/from16 v28, v5

    .line 15
    :goto_6
    const-string v3, "publishTime"

    invoke-interface {v0, v4, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_7

    move-wide/from16 v30, v5

    goto :goto_7

    .line 16
    :cond_7
    invoke-static {v3}, Ll4/y;->K(Ljava/lang/String;)J

    move-result-wide v7

    move-wide/from16 v30, v7

    :goto_7
    const-wide/16 v26, 0x0

    if-eqz v23, :cond_8

    move-wide/from16 v7, v26

    goto :goto_8

    :cond_8
    move-wide v7, v5

    .line 17
    :goto_8
    new-instance v3, LR3/b;

    .line 18
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v9

    .line 19
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v13

    if-eqz v2, :cond_9

    move v14, v12

    goto :goto_9

    :cond_9
    const/high16 v32, -0x80000000

    move/from16 v14, v32

    .line 20
    :goto_9
    invoke-direct {v3, v9, v14, v12, v13}, LR3/b;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 21
    new-array v9, v12, [LR3/b;

    aput-object v3, v9, v1

    invoke-static {v9}, LP5/q;->n([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v13

    .line 22
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 23
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    if-eqz v23, :cond_a

    move-wide/from16 v34, v5

    goto :goto_a

    :cond_a
    move-wide/from16 v34, v26

    :goto_a
    move-wide/from16 v36, v34

    move-wide/from16 v34, v5

    move-wide/from16 v5, v36

    move/from16 v32, v1

    move/from16 v36, v32

    move-object/from16 v37, v4

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v40, v39

    .line 24
    :goto_b
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 25
    const-string v9, "BaseURL"

    invoke-static {v0, v9}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v41

    if-eqz v41, :cond_c

    if-nez v32, :cond_b

    .line 26
    invoke-static {v0, v7, v8}, LR3/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v7

    move/from16 v32, v12

    .line 27
    :cond_b
    invoke-static {v0, v13, v2}, LR3/e;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move/from16 v42, v1

    move/from16 v88, v2

    move-object/from16 v51, v3

    move/from16 v41, v12

    move-object/from16 v44, v13

    move-object v9, v14

    const/16 v16, 0x2

    const/16 v33, 0x4

    :goto_c
    const/16 v43, -0x1

    move-wide v11, v10

    goto/16 :goto_87

    .line 28
    :cond_c
    const-string v12, "ProgramInformation"

    invoke-static {v0, v12}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v42

    const-string v15, "lang"

    if-eqz v42, :cond_13

    .line 29
    const-string v9, "moreInformationURL"

    invoke-interface {v0, v4, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_d

    move-object/from16 v48, v4

    goto :goto_d

    :cond_d
    move-object/from16 v48, v9

    .line 30
    :goto_d
    invoke-interface {v0, v4, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_e

    move-object/from16 v49, v4

    goto :goto_e

    :cond_e
    move-object/from16 v49, v9

    :goto_e
    move-object v9, v4

    move-object v15, v9

    move-object/from16 v37, v15

    .line 31
    :goto_f
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 32
    const-string v1, "Title"

    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 33
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v9

    :goto_10
    move-object/from16 v45, v9

    move-object/from16 v46, v15

    move-object/from16 v47, v37

    goto :goto_11

    .line 34
    :cond_f
    const-string v1, "Source"

    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 35
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v15

    goto :goto_10

    .line 36
    :cond_10
    const-string v1, "Copyright"

    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 37
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v37

    goto :goto_10

    .line 38
    :cond_11
    invoke-static {v0}, LR3/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_10

    .line 39
    :goto_11
    invoke-static {v0, v12}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 40
    new-instance v44, LR3/i;

    invoke-direct/range {v44 .. v49}, LR3/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move/from16 v88, v2

    move-object/from16 v51, v3

    move-wide v11, v10

    move-object v9, v14

    move-object/from16 v37, v44

    const/16 v16, 0x2

    const/16 v33, 0x4

    const/16 v41, 0x1

    const/16 v42, 0x0

    const/16 v43, -0x1

    move-object/from16 v44, v13

    goto/16 :goto_87

    :cond_12
    move-object/from16 v9, v45

    move-object/from16 v15, v46

    move-object/from16 v37, v47

    const/4 v1, 0x0

    goto :goto_f

    .line 41
    :cond_13
    const-string v1, "UTCTiming"

    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    const-string v12, "value"

    move-object/from16 v44, v13

    const-string v13, "schemeIdUri"

    if-eqz v1, :cond_14

    .line 42
    invoke-interface {v0, v4, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-interface {v0, v4, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 44
    new-instance v12, LR3/u;

    const/4 v13, 0x0

    invoke-direct {v12, v1, v13, v9}, LR3/u;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    move/from16 v88, v2

    move-object/from16 v51, v3

    move-object/from16 v38, v12

    move/from16 v42, v13

    move-object v9, v14

    const/16 v16, 0x2

    const/16 v33, 0x4

    const/16 v41, 0x1

    goto/16 :goto_c

    :cond_14
    const/16 v42, 0x0

    .line 45
    const-string v1, "Location"

    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 46
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9}, Ll4/a;->M(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v39

    move/from16 v88, v2

    move-object/from16 v51, v3

    move-wide v11, v10

    move-object v9, v14

    :goto_12
    const/16 v16, 0x2

    const/16 v33, 0x4

    const/16 v41, 0x1

    const/16 v43, -0x1

    goto/16 :goto_87

    .line 47
    :cond_15
    const-string v1, "ServiceDescription"

    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v45

    if-eqz v45, :cond_1e

    const v45, -0x800001

    move-wide/from16 v12, v34

    move-wide/from16 v46, v12

    move-wide/from16 v48, v46

    move/from16 v9, v45

    move v15, v9

    .line 48
    :goto_13
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 49
    const-string v4, "Latency"

    invoke-static {v0, v4}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    move-object/from16 v51, v3

    const-string v3, "max"

    move/from16 v40, v4

    const-string v4, "min"

    if-eqz v40, :cond_19

    .line 50
    const-string v12, "target"

    const/4 v13, 0x0

    invoke-interface {v0, v13, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_16

    move-wide/from16 v46, v34

    goto :goto_14

    .line 51
    :cond_16
    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v46

    .line 52
    :goto_14
    invoke-interface {v0, v13, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_17

    move-wide/from16 v48, v34

    goto :goto_15

    .line 53
    :cond_17
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v48

    .line 54
    :goto_15
    invoke-interface {v0, v13, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_18

    move-wide/from16 v3, v34

    goto :goto_16

    .line 55
    :cond_18
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    :goto_16
    move-wide/from16 v52, v7

    move-wide/from16 v12, v46

    move-wide v7, v3

    move-wide/from16 v3, v48

    goto :goto_19

    :cond_19
    move-wide/from16 v52, v7

    const/4 v7, 0x0

    .line 56
    const-string v8, "PlaybackRate"

    invoke-static {v0, v8}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1c

    .line 57
    invoke-interface {v0, v7, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1a

    move/from16 v9, v45

    goto :goto_17

    .line 58
    :cond_1a
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    move v9, v4

    .line 59
    :goto_17
    invoke-interface {v0, v7, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1b

    move/from16 v15, v45

    goto :goto_18

    .line 60
    :cond_1b
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    move v15, v3

    :cond_1c
    :goto_18
    move-wide/from16 v3, v46

    move-wide/from16 v7, v48

    .line 61
    :goto_19
    invoke-static {v0, v1}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v40

    if-eqz v40, :cond_1d

    .line 62
    new-instance v1, LR3/t;

    .line 63
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-wide v12, v1, LR3/t;->a:J

    .line 65
    iput-wide v3, v1, LR3/t;->b:J

    .line 66
    iput-wide v7, v1, LR3/t;->c:J

    .line 67
    iput v9, v1, LR3/t;->d:F

    .line 68
    iput v15, v1, LR3/t;->e:F

    move-object/from16 v40, v1

    move/from16 v88, v2

    move-wide v11, v10

    move-object v9, v14

    move-wide/from16 v7, v52

    goto/16 :goto_12

    :cond_1d
    move-wide/from16 v46, v3

    move-wide/from16 v48, v7

    move-object/from16 v3, v51

    move-wide/from16 v7, v52

    const/4 v4, 0x0

    goto/16 :goto_13

    :cond_1e
    move-object/from16 v51, v3

    move-wide/from16 v52, v7

    .line 69
    const-string v1, "Period"

    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a8

    if-nez v36, :cond_a8

    .line 70
    invoke-virtual/range {v51 .. v51}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1f

    move-object/from16 v3, v51

    goto :goto_1a

    :cond_1f
    move-object/from16 v3, v44

    .line 71
    :goto_1a
    const-string v4, "id"

    const/4 v7, 0x0

    invoke-interface {v0, v7, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v46

    .line 72
    const-string v7, "start"

    invoke-static {v0, v7, v5, v6}, LR3/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v47

    cmp-long v7, v17, v34

    if-eqz v7, :cond_20

    add-long v7, v17, v47

    :goto_1b
    move-object/from16 v54, v14

    goto :goto_1c

    :cond_20
    move-wide/from16 v7, v34

    goto :goto_1b

    .line 73
    :goto_1c
    const-string v14, "duration"

    move-wide/from16 v55, v5

    move-wide/from16 v5, v34

    invoke-static {v0, v14, v5, v6}, LR3/e;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v34

    move-object/from16 v45, v14

    .line 74
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v49, v13

    .line 75
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v57, v13

    .line 76
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    move-wide/from16 v62, v5

    move/from16 v58, v42

    move-wide/from16 v5, v52

    const/16 v59, 0x0

    .line 77
    :goto_1d
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 78
    invoke-static {v0, v9}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v64

    if-eqz v64, :cond_22

    if-nez v58, :cond_21

    .line 79
    invoke-static {v0, v5, v6}, LR3/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v5

    const/16 v58, 0x1

    :cond_21
    move-object/from16 v64, v1

    .line 80
    invoke-static {v0, v3, v2}, LR3/e;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move/from16 v88, v2

    move-object/from16 v50, v3

    move-object/from16 v109, v4

    move-wide v3, v7

    move-object/from16 v127, v9

    move-object/from16 v134, v12

    move-object/from16 v67, v13

    move-object/from16 v68, v14

    move-object/from16 v104, v15

    move-object/from16 v1, v64

    const/16 v16, 0x2

    const/16 v33, 0x4

    const/16 v41, 0x1

    const/16 v43, -0x1

    move-wide v7, v5

    move-wide v11, v10

    move-wide/from16 v5, v34

    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    goto/16 :goto_83

    :cond_22
    move-object/from16 v64, v1

    .line 81
    const-string v1, "AdaptationSet"

    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v65

    const-string v66, ""

    move-object/from16 v67, v13

    const-string v13, "SegmentBase"

    move-object/from16 v68, v14

    const-string v14, "SegmentList"

    move-object/from16 v69, v12

    const-string v12, "SegmentTemplate"

    if-eqz v65, :cond_90

    .line 82
    invoke-virtual/range {v67 .. v67}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v65

    move-object/from16 v70, v12

    if-nez v65, :cond_23

    move-object/from16 v12, v67

    :goto_1e
    move-object/from16 v65, v1

    const/4 v1, 0x0

    goto :goto_1f

    :cond_23
    move-object v12, v3

    goto :goto_1e

    .line 83
    :goto_1f
    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v50

    if-nez v50, :cond_24

    const/16 v72, -0x1

    goto :goto_20

    .line 84
    :cond_24
    invoke-static/range {v50 .. v50}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v50

    move/from16 v72, v50

    .line 85
    :goto_20
    invoke-static {v0}, LR3/e;->g(Lorg/xmlpull/v1/XmlPullParser;)I

    move-result v71

    move-object/from16 v73, v3

    .line 86
    const-string v3, "mimeType"

    invoke-interface {v0, v1, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v74

    move-wide/from16 v75, v5

    .line 87
    const-string v5, "codecs"

    invoke-interface {v0, v1, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v77

    .line 88
    const-string v6, "width"

    invoke-interface {v0, v1, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v50

    if-nez v50, :cond_25

    const/16 v78, -0x1

    :goto_21
    move-wide/from16 v79, v7

    goto :goto_22

    .line 89
    :cond_25
    invoke-static/range {v50 .. v50}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v50

    move/from16 v78, v50

    goto :goto_21

    .line 90
    :goto_22
    const-string v7, "height"

    invoke-interface {v0, v1, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_26

    const/16 v81, -0x1

    goto :goto_23

    .line 91
    :cond_26
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    move/from16 v81, v8

    :goto_23
    const/high16 v8, -0x40800000    # -1.0f

    .line 92
    invoke-static {v0, v8}, LR3/e;->j(Lorg/xmlpull/v1/XmlPullParser;F)F

    move-result v8

    move-wide/from16 v82, v10

    .line 93
    const-string v10, "audioSamplingRate"

    invoke-interface {v0, v1, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_27

    const/16 v84, -0x1

    goto :goto_24

    .line 94
    :cond_27
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    move/from16 v84, v11

    .line 95
    :goto_24
    invoke-interface {v0, v1, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 v85, v11

    .line 96
    const-string v11, "label"

    invoke-interface {v0, v1, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 97
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v86, v11

    .line 98
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v87, v11

    .line 99
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v88, v14

    .line 100
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v89, v13

    .line 101
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v90, v10

    .line 102
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move/from16 v91, v8

    .line 103
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v92, v8

    .line 104
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v96, v3

    move-object/from16 v95, v4

    move-object/from16 v94, v6

    move-object/from16 v93, v7

    move-object/from16 v97, v59

    move-wide/from16 v98, v62

    move/from16 v6, v71

    move-wide/from16 v3, v75

    move-object/from16 v7, v85

    const/16 v85, 0x0

    const/16 v100, -0x1

    move/from16 v71, v42

    .line 105
    :goto_25
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 106
    invoke-static {v0, v9}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v101

    if-eqz v101, :cond_29

    if-nez v71, :cond_28

    .line 107
    invoke-static {v0, v3, v4}, LR3/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v3

    const/16 v71, 0x1

    :cond_28
    move-wide/from16 v101, v3

    .line 108
    invoke-static {v0, v12, v2}, LR3/e;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object/from16 v132, v1

    move-object/from16 v128, v8

    move-object/from16 v127, v9

    move-object/from16 v126, v13

    move-object/from16 v105, v14

    move-object/from16 v104, v15

    move-object/from16 v8, v65

    move-object/from16 v134, v69

    move-object/from16 v14, v70

    move-object/from16 v50, v73

    move-wide/from16 v60, v75

    move-wide/from16 v106, v79

    move-object/from16 v1, v86

    move-object/from16 v13, v88

    move-object/from16 v15, v89

    move-object/from16 v75, v90

    move/from16 v115, v91

    move-object/from16 v90, v93

    move-object/from16 v93, v94

    move-object/from16 v109, v95

    move-object/from16 v94, v96

    move-wide/from16 v3, v101

    const/4 v9, 0x4

    move/from16 v88, v2

    move/from16 v73, v6

    move-object/from16 v79, v10

    move-object/from16 v76, v11

    move-object/from16 v101, v12

    :goto_26
    move-wide/from16 v11, v82

    move-object/from16 v2, v87

    move-object v10, v5

    move-object/from16 v83, v7

    move-wide/from16 v5, v34

    :goto_27
    const/4 v7, 0x2

    goto/16 :goto_5f

    :cond_29
    move-object/from16 v101, v12

    .line 109
    const-string v12, "ContentProtection"

    invoke-static {v0, v12}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v102

    if-eqz v102, :cond_2c

    .line 110
    invoke-static {v0}, LR3/e;->f(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;

    move-result-object v12

    move-wide/from16 v102, v3

    .line 111
    iget-object v3, v12, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-eqz v3, :cond_2a

    .line 112
    move-object/from16 v85, v3

    check-cast v85, Ljava/lang/String;

    .line 113
    :cond_2a
    iget-object v3, v12, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v3, :cond_2b

    .line 114
    check-cast v3, Ln3/f;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2b
    :goto_28
    move-object/from16 v132, v1

    move-object/from16 v128, v8

    move-object/from16 v127, v9

    move-object/from16 v126, v13

    move-object/from16 v105, v14

    move-object/from16 v104, v15

    move-object/from16 v8, v65

    move-object/from16 v134, v69

    move-object/from16 v14, v70

    move-object/from16 v50, v73

    move-wide/from16 v60, v75

    move-wide/from16 v106, v79

    move-object/from16 v1, v86

    move-object/from16 v13, v88

    move-object/from16 v15, v89

    move-object/from16 v75, v90

    move/from16 v115, v91

    move-object/from16 v90, v93

    move-object/from16 v93, v94

    move-object/from16 v109, v95

    move-object/from16 v94, v96

    move-wide/from16 v3, v102

    const/4 v9, 0x4

    move/from16 v88, v2

    move/from16 v73, v6

    move-object/from16 v79, v10

    move-object/from16 v76, v11

    goto :goto_26

    :cond_2c
    move-wide/from16 v102, v3

    .line 115
    const-string v3, "ContentComponent"

    invoke-static {v0, v3}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_32

    const/4 v3, 0x0

    .line 116
    invoke-interface {v0, v3, v15}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v7, :cond_2d

    move-object v7, v4

    goto :goto_29

    :cond_2d
    if-nez v4, :cond_2e

    goto :goto_29

    .line 117
    :cond_2e
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ll4/a;->m(Z)V

    .line 118
    :goto_29
    invoke-static {v0}, LR3/e;->g(Lorg/xmlpull/v1/XmlPullParser;)I

    move-result v3

    const/4 v4, -0x1

    if-ne v6, v4, :cond_2f

    move v6, v3

    goto :goto_28

    :cond_2f
    if-ne v3, v4, :cond_30

    goto :goto_28

    :cond_30
    if-ne v6, v3, :cond_31

    const/4 v3, 0x1

    goto :goto_2a

    :cond_31
    move/from16 v3, v42

    .line 119
    :goto_2a
    invoke-static {v3}, Ll4/a;->m(Z)V

    goto :goto_28

    .line 120
    :cond_32
    const-string v3, "Role"

    invoke-static {v0, v3}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_33

    .line 121
    invoke-static {v0, v3}, LR3/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LR3/f;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2b
    move-object/from16 v132, v1

    move/from16 v120, v6

    move-object/from16 v128, v8

    move-object/from16 v127, v9

    move-object/from16 v126, v13

    move-object/from16 v105, v14

    move-object/from16 v104, v15

    :goto_2c
    move-object/from16 v134, v69

    move-object/from16 v14, v70

    move-object/from16 v50, v73

    move-wide/from16 v60, v75

    move-wide/from16 v106, v79

    move-object/from16 v13, v88

    move-object/from16 v15, v89

    move-object/from16 v75, v90

    move/from16 v115, v91

    move-object/from16 v90, v93

    move-object/from16 v93, v94

    move-object/from16 v109, v95

    move-object/from16 v94, v96

    move-wide/from16 v3, v98

    const/4 v9, 0x4

    move/from16 v88, v2

    move-object/from16 v73, v5

    move-object/from16 v79, v10

    move-object/from16 v76, v11

    move-wide/from16 v5, v34

    move-wide/from16 v11, v82

    move-object/from16 v2, v87

    move-object/from16 v83, v7

    const/4 v7, 0x2

    goto/16 :goto_5e

    .line 122
    :cond_33
    const-string v3, "AudioChannelConfiguration"

    invoke-static {v0, v3}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_34

    .line 123
    invoke-static {v0}, LR3/e;->c(Lorg/xmlpull/v1/XmlPullParser;)I

    move-result v100

    goto/16 :goto_28

    .line 124
    :cond_34
    const-string v4, "Accessibility"

    invoke-static {v0, v4}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v104

    if-eqz v104, :cond_35

    .line 125
    invoke-static {v0, v4}, LR3/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LR3/f;

    move-result-object v3

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2b

    .line 126
    :cond_35
    const-string v4, "EssentialProperty"

    invoke-static {v0, v4}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v104

    if-eqz v104, :cond_36

    .line 127
    invoke-static {v0, v4}, LR3/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LR3/f;

    move-result-object v3

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2b

    :cond_36
    move-object/from16 v104, v15

    .line 128
    const-string v15, "SupplementalProperty"

    invoke-static {v0, v15}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v105

    if-eqz v105, :cond_37

    .line 129
    invoke-static {v0, v15}, LR3/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LR3/f;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v132, v1

    move/from16 v120, v6

    move-object/from16 v128, v8

    move-object/from16 v127, v9

    move-object/from16 v126, v13

    move-object/from16 v105, v14

    goto :goto_2c

    :cond_37
    move-object/from16 v105, v14

    .line 130
    const-string v14, "Representation"

    invoke-static {v0, v14}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v106

    move-object/from16 v107, v14

    const-string v14, "InbandEventStream"

    if-eqz v106, :cond_76

    .line 131
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v106

    move-object/from16 v50, v4

    move-object/from16 v4, v95

    move-object/from16 v95, v15

    if-nez v106, :cond_38

    move-object v15, v8

    :goto_2d
    move-object/from16 v106, v1

    move-object/from16 v108, v14

    const/4 v1, 0x0

    goto :goto_2e

    :cond_38
    move-object/from16 v15, v101

    goto :goto_2d

    .line 132
    :goto_2e
    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v109, v4

    .line 133
    const-string v4, "bandwidth"

    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_39

    move-object/from16 v4, v96

    const/16 v96, -0x1

    goto :goto_2f

    .line 134
    :cond_39
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v148, v96

    move/from16 v96, v4

    move-object/from16 v4, v148

    .line 135
    :goto_2f
    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v110

    if-nez v110, :cond_3a

    move-object/from16 v111, v74

    goto :goto_30

    :cond_3a
    move-object/from16 v111, v110

    .line 136
    :goto_30
    invoke-interface {v0, v1, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v110

    if-nez v110, :cond_3b

    move-object/from16 v110, v94

    move-object/from16 v94, v4

    move-object/from16 v4, v110

    move-object/from16 v110, v77

    goto :goto_31

    :cond_3b
    move-object/from16 v148, v94

    move-object/from16 v94, v4

    move-object/from16 v4, v148

    .line 137
    :goto_31
    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v112

    if-nez v112, :cond_3c

    move-object/from16 v113, v93

    move-object/from16 v93, v4

    move-object/from16 v4, v113

    move/from16 v113, v78

    goto :goto_32

    .line 138
    :cond_3c
    invoke-static/range {v112 .. v112}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v112

    move-object/from16 v113, v93

    move-object/from16 v93, v4

    move-object/from16 v4, v113

    move/from16 v113, v112

    .line 139
    :goto_32
    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v112

    if-nez v112, :cond_3d

    move/from16 v114, v81

    move-object/from16 v112, v14

    move/from16 v1, v91

    goto :goto_33

    .line 140
    :cond_3d
    invoke-static/range {v112 .. v112}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v112

    move/from16 v114, v112

    move/from16 v1, v91

    move-object/from16 v112, v14

    .line 141
    :goto_33
    invoke-static {v0, v1}, LR3/e;->j(Lorg/xmlpull/v1/XmlPullParser;F)F

    move-result v14

    move-object/from16 v115, v90

    move-object/from16 v90, v4

    move-object/from16 v4, v115

    move/from16 v115, v1

    const/4 v1, 0x0

    .line 142
    invoke-interface {v0, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v91

    if-nez v91, :cond_3e

    move/from16 v116, v84

    :goto_34
    move/from16 v91, v14

    goto :goto_35

    .line 143
    :cond_3e
    invoke-static/range {v91 .. v91}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v91

    move/from16 v116, v91

    goto :goto_34

    .line 144
    :goto_35
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v122, v14

    .line 145
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v123, v14

    .line 146
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v126, v13

    .line 147
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v125, v13

    .line 148
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v118, v1

    move/from16 v120, v6

    move-object/from16 v119, v7

    move/from16 v117, v42

    move-object/from16 v121, v97

    move-wide/from16 v127, v98

    move/from16 v124, v100

    move-wide/from16 v6, v102

    .line 149
    :goto_36
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 150
    invoke-static {v0, v9}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v129

    if-eqz v129, :cond_40

    if-nez v117, :cond_3f

    .line 151
    invoke-static {v0, v6, v7}, LR3/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v6

    const/16 v117, 0x1

    .line 152
    :cond_3f
    invoke-static {v0, v15, v2}, LR3/e;->e(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/ArrayList;Z)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :goto_37
    move-object/from16 v134, v69

    move-object/from16 v135, v70

    move-wide/from16 v60, v75

    move-object/from16 v133, v87

    move-object/from16 v131, v88

    move/from16 v70, v96

    move-object/from16 v132, v106

    move-object/from16 v69, v121

    move-object/from16 v1, v125

    const/16 v41, 0x1

    move/from16 v88, v2

    move-object/from16 v75, v4

    move-object/from16 v76, v11

    move-object/from16 v121, v118

    move/from16 v2, v124

    move-wide/from16 v148, v79

    move-object/from16 v80, v3

    move-object/from16 v79, v10

    move-object/from16 v3, v107

    move-object/from16 v10, v122

    move-wide/from16 v106, v148

    move-object/from16 v148, v73

    move-object/from16 v73, v5

    move-wide/from16 v149, v127

    move-object/from16 v128, v8

    move-wide v7, v6

    move-object/from16 v127, v9

    move-wide/from16 v5, v34

    move-object/from16 v9, v108

    move-object/from16 v34, v13

    move-object/from16 v35, v15

    move-object/from16 v13, v50

    move-object/from16 v50, v148

    move-object v15, v12

    move-wide/from16 v11, v82

    move-object/from16 v83, v119

    move/from16 v82, v120

    move-wide/from16 v119, v149

    goto/16 :goto_3d

    .line 153
    :cond_40
    invoke-static {v0, v3}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_41

    .line 154
    invoke-static {v0}, LR3/e;->c(Lorg/xmlpull/v1/XmlPullParser;)I

    move-result v124

    goto :goto_37

    :cond_41
    move-object/from16 v1, v89

    .line 155
    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v89

    if-eqz v89, :cond_42

    move-object/from16 v89, v1

    .line 156
    move-object/from16 v1, v121

    check-cast v1, LR3/r;

    invoke-static {v0, v1}, LR3/e;->p(Lorg/xmlpull/v1/XmlPullParser;LR3/r;)LR3/r;

    move-result-object v121

    goto :goto_37

    :cond_42
    move-object/from16 v89, v1

    move-object/from16 v1, v88

    .line 157
    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v88

    if-eqz v88, :cond_43

    move-object/from16 v130, v1

    move/from16 v88, v2

    move-wide/from16 v1, v127

    move-object/from16 v128, v8

    move-object/from16 v127, v9

    .line 158
    invoke-static {v0, v1, v2}, LR3/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v8

    .line 159
    move-object/from16 v1, v121

    check-cast v1, LR3/o;

    move-wide/from16 v60, v79

    move-object/from16 v80, v3

    move-wide/from16 v2, v60

    move-object/from16 v79, v10

    move-wide/from16 v60, v75

    move-object/from16 v133, v87

    move-object/from16 v132, v106

    move-object/from16 v131, v130

    move-object/from16 v75, v4

    move-object/from16 v76, v11

    move-wide/from16 v10, v82

    move-object/from16 v83, v119

    move/from16 v82, v120

    move-object/from16 v148, v73

    move-object/from16 v73, v5

    move-wide/from16 v4, v34

    move-object/from16 v34, v13

    move-object/from16 v35, v15

    move-object/from16 v13, v50

    move-object/from16 v50, v148

    move/from16 v15, v96

    .line 160
    invoke-static/range {v0 .. v11}, LR3/e;->q(Lorg/xmlpull/v1/XmlPullParser;LR3/o;JJJJJ)LR3/o;

    move-result-object v121

    move-wide/from16 v119, v6

    move-wide v5, v4

    move-wide v3, v2

    move-wide v1, v3

    move-object/from16 v3, v107

    move-wide/from16 v106, v1

    move-wide/from16 v1, v119

    move-wide/from16 v119, v8

    move-wide v7, v1

    move-object/from16 v134, v69

    move-object/from16 v135, v70

    move-object/from16 v9, v108

    move-object/from16 v69, v121

    move/from16 v2, v124

    move-object/from16 v1, v125

    const/16 v41, 0x1

    move/from16 v70, v15

    move-object/from16 v121, v118

    move-object v15, v12

    move-wide v11, v10

    move-object/from16 v10, v122

    goto/16 :goto_3d

    :cond_43
    move-object/from16 v131, v1

    move/from16 v88, v2

    move-wide/from16 v60, v75

    move-object/from16 v133, v87

    move-object/from16 v132, v106

    move-wide/from16 v1, v127

    move-object/from16 v75, v4

    move-object/from16 v128, v8

    move-object/from16 v127, v9

    move-object/from16 v76, v11

    move-wide/from16 v148, v79

    move-object/from16 v80, v3

    move-object/from16 v79, v10

    move-wide/from16 v3, v148

    move-wide/from16 v10, v82

    move-object/from16 v83, v119

    move/from16 v82, v120

    move-wide/from16 v119, v6

    move-object/from16 v7, v70

    move-object/from16 v148, v73

    move-object/from16 v73, v5

    move-wide/from16 v5, v34

    move-object/from16 v34, v13

    move-object/from16 v35, v15

    move-object/from16 v13, v50

    move-object/from16 v50, v148

    move/from16 v15, v96

    .line 161
    invoke-static {v0, v7}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_44

    move-object v8, v12

    move-wide v11, v10

    .line 162
    invoke-static {v0, v1, v2}, LR3/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v9

    .line 163
    move-object/from16 v1, v121

    check-cast v1, LR3/p;

    move-object/from16 v135, v7

    move/from16 v70, v15

    move-object/from16 v134, v69

    move-object/from16 v2, v79

    const/16 v41, 0x1

    move-object v15, v8

    move-wide/from16 v7, v119

    .line 164
    invoke-static/range {v0 .. v12}, LR3/e;->r(Lorg/xmlpull/v1/XmlPullParser;LR3/p;Ljava/util/List;JJJJJ)LR3/p;

    move-result-object v121

    move-wide v1, v3

    move-object/from16 v3, v107

    move-wide/from16 v106, v1

    move-wide/from16 v119, v9

    move-object/from16 v9, v108

    move-object/from16 v69, v121

    move-object/from16 v10, v122

    :goto_38
    move/from16 v2, v124

    move-object/from16 v1, v125

    :goto_39
    move-object/from16 v121, v118

    goto/16 :goto_3d

    :cond_44
    move-object/from16 v135, v7

    move/from16 v70, v15

    move-object/from16 v134, v69

    move-wide/from16 v7, v119

    const/16 v41, 0x1

    move-object v15, v12

    move-wide v11, v10

    .line 165
    invoke-static {v0, v15}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_47

    .line 166
    invoke-static {v0}, LR3/e;->f(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;

    move-result-object v9

    .line 167
    iget-object v10, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-eqz v10, :cond_45

    .line 168
    move-object/from16 v118, v10

    check-cast v118, Ljava/lang/String;

    .line 169
    :cond_45
    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v9, :cond_46

    .line 170
    check-cast v9, Ln3/f;

    move-object/from16 v10, v122

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3a

    :cond_46
    move-object/from16 v10, v122

    :goto_3a
    move-wide/from16 v119, v3

    move-object/from16 v3, v107

    move-wide/from16 v106, v119

    move-wide/from16 v119, v1

    move-object/from16 v9, v108

    move-object/from16 v69, v121

    goto :goto_38

    :cond_47
    move-object/from16 v9, v108

    move-object/from16 v10, v122

    .line 171
    invoke-static {v0, v9}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v69

    if-eqz v69, :cond_48

    move-wide/from16 v119, v1

    .line 172
    invoke-static {v0, v9}, LR3/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LR3/f;

    move-result-object v1

    move-object/from16 v2, v123

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3b
    move-object/from16 v1, v125

    goto :goto_3c

    :cond_48
    move-wide/from16 v119, v1

    move-object/from16 v2, v123

    .line 173
    invoke-static {v0, v13}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_49

    .line 174
    invoke-static {v0, v13}, LR3/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LR3/f;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v123, v2

    goto :goto_3b

    :cond_49
    move-object/from16 v1, v95

    .line 175
    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v69

    if-eqz v69, :cond_4a

    move-object/from16 v123, v2

    .line 176
    invoke-static {v0, v1}, LR3/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LR3/f;

    move-result-object v2

    move-object/from16 v95, v1

    move-object/from16 v1, v125

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3c

    :cond_4a
    move-object/from16 v95, v1

    move-object/from16 v123, v2

    move-object/from16 v1, v125

    .line 177
    invoke-static {v0}, LR3/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    :goto_3c
    move-wide/from16 v148, v3

    move-object/from16 v3, v107

    move-wide/from16 v106, v148

    move-object/from16 v69, v121

    move/from16 v2, v124

    goto/16 :goto_39

    .line 178
    :goto_3d
    invoke-static {v0, v3}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_75

    .line 179
    invoke-static/range {v111 .. v111}, Ll4/n;->j(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "image"

    if-eqz v3, :cond_4b

    .line 180
    invoke-static/range {v110 .. v110}, Ll4/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_3e
    move-object/from16 v7, v111

    goto :goto_40

    .line 181
    :cond_4b
    invoke-static/range {v111 .. v111}, Ll4/n;->l(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4c

    .line 182
    invoke-static/range {v110 .. v110}, Ll4/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_3e

    .line 183
    :cond_4c
    invoke-static/range {v111 .. v111}, Ll4/n;->k(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4d

    goto :goto_3f

    .line 184
    :cond_4d
    invoke-static/range {v111 .. v111}, Ll4/n;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4e

    :goto_3f
    move-object/from16 v3, v111

    move-object v7, v3

    goto :goto_40

    .line 185
    :cond_4e
    const-string v3, "application/mp4"

    move-object/from16 v7, v111

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4f

    .line 186
    invoke-static/range {v110 .. v110}, Ll4/n;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 187
    const-string v8, "text/vtt"

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_50

    const-string v3, "application/x-mp4-vtt"

    goto :goto_40

    :cond_4f
    const/4 v3, 0x0

    .line 188
    :cond_50
    :goto_40
    const-string v8, "audio/eac3"

    invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_56

    move/from16 v3, v42

    .line 189
    :goto_41
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v9

    const-string v13, "audio/eac3-joc"

    const-string v15, "ec+3"

    if-ge v3, v9, :cond_54

    .line 190
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LR3/f;

    move-object/from16 v125, v1

    .line 191
    iget-object v1, v9, LR3/f;->a:Ljava/lang/String;

    move/from16 v80, v3

    .line 192
    const-string v3, "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    iget-object v9, v9, LR3/f;->b:Ljava/lang/String;

    if-eqz v3, :cond_51

    const-string v3, "JOC"

    .line 193
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_52

    :cond_51
    const-string v3, "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"

    .line 194
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_53

    .line 195
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_53

    :cond_52
    move-object v3, v13

    goto :goto_42

    :cond_53
    add-int/lit8 v3, v80, 0x1

    move-object/from16 v1, v125

    goto :goto_41

    :cond_54
    move-object/from16 v125, v1

    move-object v3, v8

    .line 196
    :goto_42
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_55

    goto :goto_44

    :cond_55
    :goto_43
    move-object/from16 v15, v110

    goto :goto_44

    :cond_56
    move-object/from16 v125, v1

    goto :goto_43

    :goto_44
    move/from16 v1, v42

    move v8, v1

    .line 197
    :goto_45
    invoke-virtual/range {v105 .. v105}, Ljava/util/ArrayList;->size()I

    move-result v9

    const-string v13, "urn:mpeg:dash:role:2011"

    if-ge v1, v9, :cond_5a

    move-object/from16 v9, v105

    .line 198
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v80

    move/from16 v87, v1

    move-object/from16 v1, v80

    check-cast v1, LR3/f;

    move-wide/from16 v136, v5

    .line 199
    iget-object v5, v1, LR3/f;->a:Ljava/lang/String;

    invoke-static {v13, v5}, LB6/u0;->w(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_59

    .line 200
    iget-object v1, v1, LR3/f;->b:Ljava/lang/String;

    if-nez v1, :cond_57

    :goto_46
    move/from16 v1, v42

    goto :goto_47

    .line 201
    :cond_57
    const-string v5, "forced_subtitle"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_58

    const-string v5, "forced-subtitle"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_58

    goto :goto_46

    :cond_58
    const/4 v1, 0x2

    :goto_47
    or-int/2addr v1, v8

    move v8, v1

    :cond_59
    add-int/lit8 v1, v87, 0x1

    move-object/from16 v105, v9

    move-wide/from16 v5, v136

    goto :goto_45

    :cond_5a
    move-wide/from16 v136, v5

    move-object/from16 v9, v105

    move/from16 v1, v42

    move v5, v1

    .line 202
    :goto_48
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v1, v6, :cond_5c

    .line 203
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LR3/f;

    move/from16 v80, v1

    .line 204
    iget-object v1, v6, LR3/f;->a:Ljava/lang/String;

    invoke-static {v13, v1}, LB6/u0;->w(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5b

    .line 205
    iget-object v1, v6, LR3/f;->b:Ljava/lang/String;

    invoke-static {v1}, LR3/e;->n(Ljava/lang/String;)I

    move-result v1

    or-int/2addr v1, v5

    move v5, v1

    :cond_5b
    add-int/lit8 v1, v80, 0x1

    goto :goto_48

    :cond_5c
    move/from16 v80, v5

    move/from16 v1, v42

    move v6, v1

    .line 206
    :goto_49
    invoke-virtual/range {v76 .. v76}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v1, v5, :cond_65

    move-object/from16 v5, v76

    .line 207
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v76

    move/from16 v87, v1

    move-object/from16 v1, v76

    check-cast v1, LR3/f;

    move/from16 v76, v6

    .line 208
    iget-object v6, v1, LR3/f;->a:Ljava/lang/String;

    invoke-static {v13, v6}, LB6/u0;->w(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    move/from16 v95, v6

    iget-object v6, v1, LR3/f;->b:Ljava/lang/String;

    if-eqz v95, :cond_5d

    .line 209
    invoke-static {v6}, LR3/e;->n(Ljava/lang/String;)I

    move-result v1

    or-int v1, v76, v1

    move v6, v1

    move-object/from16 v105, v9

    goto/16 :goto_4e

    :cond_5d
    move-object/from16 v105, v9

    .line 210
    const-string v9, "urn:tva:metadata:cs:AudioPurposeCS:2007"

    iget-object v1, v1, LR3/f;->a:Ljava/lang/String;

    invoke-static {v9, v1}, LB6/u0;->w(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_64

    if-nez v6, :cond_5e

    :goto_4a
    move/from16 v1, v42

    goto :goto_4d

    .line 211
    :cond_5e
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :goto_4b
    :pswitch_0
    const/4 v1, -0x1

    goto :goto_4c

    :pswitch_1
    const-string v1, "6"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5f

    goto :goto_4b

    :cond_5f
    const/4 v1, 0x4

    goto :goto_4c

    :pswitch_2
    const-string v1, "4"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_60

    goto :goto_4b

    :cond_60
    const/4 v1, 0x3

    goto :goto_4c

    :pswitch_3
    const-string v1, "3"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_61

    goto :goto_4b

    :cond_61
    const/4 v1, 0x2

    goto :goto_4c

    :pswitch_4
    const-string v1, "2"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_62

    goto :goto_4b

    :cond_62
    move/from16 v1, v41

    goto :goto_4c

    :pswitch_5
    const-string v1, "1"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_63

    goto :goto_4b

    :cond_63
    move/from16 v1, v42

    :goto_4c
    packed-switch v1, :pswitch_data_1

    goto :goto_4a

    :pswitch_6
    move/from16 v1, v41

    goto :goto_4d

    :pswitch_7
    const/16 v1, 0x8

    goto :goto_4d

    :pswitch_8
    const/4 v1, 0x4

    goto :goto_4d

    :pswitch_9
    const/16 v1, 0x800

    goto :goto_4d

    :pswitch_a
    const/16 v1, 0x200

    :goto_4d
    or-int v1, v76, v1

    move v6, v1

    goto :goto_4e

    :cond_64
    move/from16 v6, v76

    :goto_4e
    add-int/lit8 v1, v87, 0x1

    move-object/from16 v76, v5

    move-object/from16 v9, v105

    goto/16 :goto_49

    :cond_65
    move-object/from16 v105, v9

    move-object/from16 v5, v76

    move/from16 v76, v6

    or-int v1, v80, v76

    .line 212
    invoke-static {v14}, LR3/e;->o(Ljava/util/ArrayList;)I

    move-result v6

    or-int/2addr v1, v6

    .line 213
    invoke-static/range {v125 .. v125}, LR3/e;->o(Ljava/util/ArrayList;)I

    move-result v6

    or-int/2addr v1, v6

    .line 214
    new-instance v6, Lj3/L;

    invoke-direct {v6}, Lj3/L;-><init>()V

    move-object/from16 v9, v112

    .line 215
    iput-object v9, v6, Lj3/L;->a:Ljava/lang/String;

    .line 216
    iput-object v7, v6, Lj3/L;->j:Ljava/lang/String;

    .line 217
    iput-object v3, v6, Lj3/L;->k:Ljava/lang/String;

    .line 218
    iput-object v15, v6, Lj3/L;->h:Ljava/lang/String;

    move/from16 v7, v70

    .line 219
    iput v7, v6, Lj3/L;->g:I

    .line 220
    iput v8, v6, Lj3/L;->d:I

    .line 221
    iput v1, v6, Lj3/L;->e:I

    move-object/from16 v1, v83

    .line 222
    iput-object v1, v6, Lj3/L;->c:Ljava/lang/String;

    .line 223
    invoke-static {v3}, Ll4/n;->l(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_66

    move/from16 v7, v113

    .line 224
    iput v7, v6, Lj3/L;->p:I

    move/from16 v8, v114

    .line 225
    iput v8, v6, Lj3/L;->q:I

    move/from16 v4, v91

    .line 226
    iput v4, v6, Lj3/L;->r:F

    goto/16 :goto_54

    :cond_66
    move/from16 v7, v113

    move/from16 v8, v114

    .line 227
    invoke-static {v3}, Ll4/n;->j(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_67

    .line 228
    iput v2, v6, Lj3/L;->x:I

    move/from16 v2, v116

    .line 229
    iput v2, v6, Lj3/L;->y:I

    goto/16 :goto_54

    .line 230
    :cond_67
    invoke-static {v3}, Ll4/n;->k(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6e

    .line 231
    const-string v2, "application/cea-608"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v4, "MpdParser"

    if-eqz v2, :cond_6a

    move/from16 v2, v42

    .line 232
    :goto_4f
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_6d

    .line 233
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LR3/f;

    .line 234
    iget-object v7, v3, LR3/f;->a:Ljava/lang/String;

    const-string v8, "urn:scte:dash:cc:cea-608:2015"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_69

    iget-object v3, v3, LR3/f;->b:Ljava/lang/String;

    if-eqz v3, :cond_69

    .line 235
    sget-object v7, LR3/e;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    .line 236
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    move-result v8

    if-eqz v8, :cond_68

    move/from16 v8, v41

    .line 237
    invoke-virtual {v7, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_53

    :cond_68
    move/from16 v8, v41

    .line 238
    const-string v7, "Unable to parse CEA-608 channel number from: "

    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_50

    :cond_69
    move/from16 v8, v41

    :goto_50
    add-int/2addr v2, v8

    move/from16 v41, v8

    goto :goto_4f

    .line 239
    :cond_6a
    const-string v2, "application/cea-708"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6d

    move/from16 v2, v42

    .line 240
    :goto_51
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_6d

    .line 241
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LR3/f;

    .line 242
    iget-object v7, v3, LR3/f;->a:Ljava/lang/String;

    const-string v8, "urn:scte:dash:cc:cea-708:2015"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6c

    iget-object v3, v3, LR3/f;->b:Ljava/lang/String;

    if-eqz v3, :cond_6c

    .line 243
    sget-object v7, LR3/e;->d:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    .line 244
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    move-result v8

    if-eqz v8, :cond_6b

    const/4 v8, 0x1

    .line 245
    invoke-virtual {v7, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_53

    :cond_6b
    const/4 v8, 0x1

    .line 246
    const-string v7, "Unable to parse CEA-708 service block number from: "

    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_52

    :cond_6c
    const/4 v8, 0x1

    :goto_52
    add-int/2addr v2, v8

    goto :goto_51

    :cond_6d
    const/4 v2, -0x1

    .line 247
    :goto_53
    iput v2, v6, Lj3/L;->C:I

    goto :goto_54

    .line 248
    :cond_6e
    invoke-static {v3}, Ll4/n;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6f

    .line 249
    iput v7, v6, Lj3/L;->p:I

    .line 250
    iput v8, v6, Lj3/L;->q:I

    .line 251
    :cond_6f
    :goto_54
    new-instance v2, Lj3/M;

    invoke-direct {v2, v6}, Lj3/M;-><init>(Lj3/L;)V

    if-eqz v69, :cond_70

    move-object/from16 v120, v69

    goto :goto_55

    .line 252
    :cond_70
    new-instance v138, LR3/r;

    const-wide/16 v140, 0x1

    const-wide/16 v142, 0x0

    const/16 v139, 0x0

    const-wide/16 v144, 0x0

    const-wide/16 v146, 0x0

    .line 253
    invoke-direct/range {v138 .. v147}, LR3/r;-><init>(LR3/j;JJJJ)V

    move-object/from16 v120, v138

    .line 254
    :goto_55
    new-instance v117, LR3/d;

    .line 255
    invoke-virtual/range {v34 .. v34}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_71

    move-object/from16 v119, v34

    :goto_56
    move-object/from16 v118, v2

    move-object/from16 v122, v10

    move-object/from16 v124, v14

    goto :goto_57

    :cond_71
    move-object/from16 v119, v35

    goto :goto_56

    :goto_57
    invoke-direct/range {v117 .. v125}, LR3/d;-><init>(Lj3/M;Ljava/util/ArrayList;LR3/s;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    move-object/from16 v3, v117

    move-object/from16 v2, v118

    .line 256
    iget-object v2, v2, Lj3/M;->l:Ljava/lang/String;

    .line 257
    invoke-static {v2}, Ll4/n;->h(Ljava/lang/String;)I

    move-result v6

    move/from16 v14, v82

    const/4 v4, -0x1

    if-ne v14, v4, :cond_72

    :goto_58
    move-object/from16 v10, v92

    goto :goto_5b

    :cond_72
    if-ne v6, v4, :cond_73

    :goto_59
    move v6, v14

    goto :goto_58

    :cond_73
    if-ne v14, v6, :cond_74

    const/4 v2, 0x1

    goto :goto_5a

    :cond_74
    move/from16 v2, v42

    .line 258
    :goto_5a
    invoke-static {v2}, Ll4/a;->m(Z)V

    goto :goto_59

    .line 259
    :goto_5b
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v83, v1

    move-object/from16 v76, v5

    move-object/from16 v92, v10

    move-object/from16 v8, v65

    move-object/from16 v10, v73

    move-object/from16 v1, v86

    move-object/from16 v15, v89

    move-wide/from16 v3, v102

    move-object/from16 v13, v131

    move-object/from16 v2, v133

    move-object/from16 v14, v135

    const/4 v7, 0x2

    const/4 v9, 0x4

    move/from16 v73, v6

    move-wide/from16 v5, v136

    goto/16 :goto_5f

    :cond_75
    move-wide/from16 v136, v5

    move-object/from16 v124, v14

    move-object/from16 v5, v76

    move/from16 v14, v82

    move-object/from16 v125, v1

    move-wide v6, v7

    move-object/from16 v108, v9

    move-object/from16 v122, v10

    move/from16 v96, v70

    move-object/from16 v4, v75

    move-object/from16 v10, v79

    move-object/from16 v118, v121

    move-object/from16 v9, v127

    move-object/from16 v8, v128

    move-object/from16 v87, v133

    move-object/from16 v70, v135

    const/4 v1, 0x0

    move-wide/from16 v75, v60

    move-object/from16 v121, v69

    move-wide/from16 v127, v119

    move-object/from16 v69, v134

    move/from16 v120, v14

    move-object/from16 v119, v83

    move-object/from16 v14, v124

    move/from16 v124, v2

    move-wide/from16 v82, v11

    move-object v12, v15

    move-object/from16 v15, v35

    move/from16 v2, v88

    move-object/from16 v88, v131

    move-object v11, v5

    move-object/from16 v5, v73

    move-object/from16 v73, v50

    move-object/from16 v50, v13

    move-object/from16 v13, v34

    move-wide/from16 v34, v136

    move-wide/from16 v148, v106

    move-object/from16 v107, v3

    move-object/from16 v3, v80

    move-wide/from16 v79, v148

    move-object/from16 v106, v132

    goto/16 :goto_36

    :cond_76
    move-object/from16 v132, v1

    move-object v1, v7

    move-object/from16 v128, v8

    move-object/from16 v127, v9

    move-object/from16 v126, v13

    move-object v9, v14

    move-wide/from16 v136, v34

    move-object/from16 v134, v69

    move-object/from16 v135, v70

    move-object/from16 v50, v73

    move-wide/from16 v60, v75

    move-wide/from16 v106, v79

    move-object/from16 v133, v87

    move-object/from16 v131, v88

    move-object/from16 v75, v90

    move/from16 v115, v91

    move-object/from16 v90, v93

    move-object/from16 v93, v94

    move-object/from16 v109, v95

    move-object/from16 v94, v96

    move/from16 v88, v2

    move-object/from16 v73, v5

    move v14, v6

    move-object/from16 v79, v10

    move-object v5, v11

    move-wide/from16 v11, v82

    move-object/from16 v2, v89

    move-object/from16 v10, v92

    .line 260
    invoke-static {v0, v2}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_77

    .line 261
    move-object/from16 v3, v97

    check-cast v3, LR3/r;

    invoke-static {v0, v3}, LR3/e;->p(Lorg/xmlpull/v1/XmlPullParser;LR3/r;)LR3/r;

    move-result-object v97

    move-object/from16 v83, v1

    move-object v15, v2

    move-object/from16 v76, v5

    move-object/from16 v92, v10

    move-object/from16 v8, v65

    move-object/from16 v10, v73

    move-object/from16 v1, v86

    move-wide/from16 v3, v102

    move-object/from16 v13, v131

    move-object/from16 v2, v133

    move-wide/from16 v5, v136

    :goto_5c
    const/4 v7, 0x2

    const/4 v9, 0x4

    move/from16 v73, v14

    move-object/from16 v14, v135

    goto/16 :goto_5f

    :cond_77
    move-object/from16 v13, v131

    .line 262
    invoke-static {v0, v13}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_78

    move-wide/from16 v3, v98

    .line 263
    invoke-static {v0, v3, v4}, LR3/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v8

    .line 264
    check-cast v97, LR3/o;

    move-object/from16 v83, v1

    move-object v15, v2

    move-object/from16 v76, v5

    move-object/from16 v92, v10

    move-wide v10, v11

    move-object/from16 v1, v97

    move-wide/from16 v6, v102

    move-wide/from16 v2, v106

    move-wide/from16 v4, v136

    .line 265
    invoke-static/range {v0 .. v11}, LR3/e;->q(Lorg/xmlpull/v1/XmlPullParser;LR3/o;JJJJJ)LR3/o;

    move-result-object v97

    move-wide v11, v10

    move-wide v5, v4

    move-wide/from16 v98, v8

    move-object/from16 v8, v65

    move-object/from16 v10, v73

    move-object/from16 v1, v86

    move-wide/from16 v3, v102

    move-object/from16 v2, v133

    goto :goto_5c

    :cond_78
    move-object/from16 v83, v1

    move-object v15, v2

    move-object/from16 v76, v5

    move-object/from16 v92, v10

    move-wide/from16 v3, v98

    move-object/from16 v1, v135

    move-wide/from16 v5, v136

    .line 266
    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_79

    .line 267
    invoke-static {v0, v3, v4}, LR3/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v9

    .line 268
    check-cast v97, LR3/p;

    move/from16 v120, v14

    move-object/from16 v2, v79

    move-wide/from16 v7, v102

    move-wide/from16 v3, v106

    move-object v14, v1

    move-object/from16 v1, v97

    .line 269
    invoke-static/range {v0 .. v12}, LR3/e;->r(Lorg/xmlpull/v1/XmlPullParser;LR3/p;Ljava/util/List;JJJJJ)LR3/p;

    move-result-object v97

    move-wide/from16 v98, v9

    move-object/from16 v8, v65

    move-object/from16 v10, v73

    move-object/from16 v1, v86

    move-wide/from16 v3, v102

    move/from16 v73, v120

    move-object/from16 v2, v133

    const/4 v7, 0x2

    const/4 v9, 0x4

    goto :goto_5f

    :cond_79
    move/from16 v120, v14

    move-object v14, v1

    .line 270
    invoke-static {v0, v9}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7a

    .line 271
    invoke-static {v0, v9}, LR3/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LR3/f;

    move-result-object v1

    move-object/from16 v2, v133

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x2

    const/4 v9, 0x4

    goto :goto_5e

    :cond_7a
    move-object/from16 v2, v133

    .line 272
    const-string v1, "Label"

    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7d

    move-object/from16 v7, v66

    .line 273
    :cond_7b
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 274
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v8

    const/4 v9, 0x4

    if-ne v8, v9, :cond_7c

    .line 275
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v7

    goto :goto_5d

    .line 276
    :cond_7c
    invoke-static {v0}, LR3/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 277
    :goto_5d
    invoke-static {v0, v1}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_7b

    move-wide/from16 v98, v3

    move-object v1, v7

    move-object/from16 v8, v65

    move-object/from16 v10, v73

    move-wide/from16 v3, v102

    move/from16 v73, v120

    goto/16 :goto_27

    :cond_7d
    const/4 v9, 0x4

    .line 278
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v1

    const/4 v7, 0x2

    if-ne v1, v7, :cond_7e

    .line 279
    invoke-static {v0}, LR3/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    :cond_7e
    :goto_5e
    move-wide/from16 v98, v3

    move-object/from16 v8, v65

    move-object/from16 v10, v73

    move-object/from16 v1, v86

    move-wide/from16 v3, v102

    move/from16 v73, v120

    .line 280
    :goto_5f
    invoke-static {v0, v8}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v16

    if-eqz v16, :cond_8f

    .line 281
    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual/range {v92 .. v92}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    move/from16 v4, v42

    .line 282
    :goto_60
    invoke-virtual/range {v92 .. v92}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v4, v8, :cond_8e

    move-object/from16 v8, v92

    .line 283
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LR3/d;

    .line 284
    iget-object v13, v10, LR3/d;->a:Lj3/M;

    invoke-virtual {v13}, Lj3/M;->a()Lj3/L;

    move-result-object v13

    if-eqz v1, :cond_7f

    .line 285
    iput-object v1, v13, Lj3/L;->b:Ljava/lang/String;

    .line 286
    :cond_7f
    iget-object v14, v10, LR3/d;->d:Ljava/lang/String;

    if-nez v14, :cond_80

    move-object/from16 v14, v85

    .line 287
    :cond_80
    iget-object v15, v10, LR3/d;->e:Ljava/util/ArrayList;

    move-object/from16 v7, v132

    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 288
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v33

    move-object/from16 v34, v1

    if-nez v33, :cond_8b

    move/from16 v9, v42

    .line 289
    :goto_61
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v9, v1, :cond_82

    .line 290
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln3/f;

    move/from16 v35, v4

    .line 291
    sget-object v4, Lj3/g;->c:Ljava/util/UUID;

    move-wide/from16 v136, v5

    iget-object v5, v1, Ln3/f;->b:Ljava/util/UUID;

    invoke-virtual {v4, v5}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_81

    iget-object v4, v1, Ln3/f;->c:Ljava/lang/String;

    if-eqz v4, :cond_81

    .line 292
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_62

    :cond_81
    const/16 v41, 0x1

    add-int/lit8 v9, v9, 0x1

    move/from16 v4, v35

    move-wide/from16 v5, v136

    goto :goto_61

    :cond_82
    move/from16 v35, v4

    move-wide/from16 v136, v5

    const/4 v4, 0x0

    :goto_62
    if-nez v4, :cond_84

    :cond_83
    move-object/from16 v132, v7

    const/16 v41, 0x1

    goto :goto_66

    :cond_84
    move/from16 v1, v42

    .line 293
    :goto_63
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v1, v5, :cond_83

    .line 294
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln3/f;

    .line 295
    sget-object v6, Lj3/g;->b:Ljava/util/UUID;

    iget-object v9, v5, Ln3/f;->b:Ljava/util/UUID;

    invoke-virtual {v6, v9}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_85

    iget-object v6, v5, Ln3/f;->c:Ljava/lang/String;

    if-nez v6, :cond_85

    .line 296
    new-instance v6, Ln3/f;

    sget-object v9, Lj3/g;->c:Ljava/util/UUID;

    move-object/from16 v132, v7

    iget-object v7, v5, Ln3/f;->d:Ljava/lang/String;

    iget-object v5, v5, Ln3/f;->e:[B

    invoke-direct {v6, v9, v4, v7, v5}, Ln3/f;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    invoke-virtual {v15, v1, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_64
    const/16 v41, 0x1

    goto :goto_65

    :cond_85
    move-object/from16 v132, v7

    goto :goto_64

    :goto_65
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v7, v132

    goto :goto_63

    .line 297
    :goto_66
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_67
    if-ltz v1, :cond_8a

    .line 298
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln3/f;

    .line 299
    iget-object v5, v4, Ln3/f;->e:[B

    if-eqz v5, :cond_87

    :cond_86
    :goto_68
    const/16 v43, -0x1

    goto :goto_6b

    :cond_87
    move/from16 v5, v42

    .line 300
    :goto_69
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_86

    .line 301
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln3/f;

    .line 302
    iget-object v7, v6, Ln3/f;->e:[B

    if-eqz v7, :cond_88

    .line 303
    iget-object v7, v4, Ln3/f;->e:[B

    if-eqz v7, :cond_89

    :cond_88
    const/16 v41, 0x1

    goto :goto_6a

    .line 304
    :cond_89
    iget-object v7, v4, Ln3/f;->b:Ljava/util/UUID;

    invoke-virtual {v6, v7}, Ln3/f;->a(Ljava/util/UUID;)Z

    move-result v6

    if-eqz v6, :cond_88

    .line 305
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_68

    :goto_6a
    add-int/lit8 v5, v5, 0x1

    goto :goto_69

    :goto_6b
    add-int/lit8 v1, v1, -0x1

    goto :goto_67

    :cond_8a
    const/16 v43, -0x1

    .line 306
    new-instance v1, Ln3/g;

    invoke-direct {v1, v14, v15}, Ln3/g;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 307
    iput-object v1, v13, Lj3/L;->n:Ln3/g;

    goto :goto_6c

    :cond_8b
    move/from16 v35, v4

    move-wide/from16 v136, v5

    move-object/from16 v132, v7

    const/16 v43, -0x1

    .line 308
    :goto_6c
    iget-object v1, v10, LR3/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 309
    new-instance v4, Lj3/M;

    invoke-direct {v4, v13}, Lj3/M;-><init>(Lj3/L;)V

    .line 310
    iget-object v5, v10, LR3/d;->c:LR3/s;

    instance-of v6, v5, LR3/r;

    iget-object v7, v10, LR3/d;->b:LP5/F;

    if-eqz v6, :cond_8c

    .line 311
    new-instance v6, LR3/l;

    check-cast v5, LR3/r;

    invoke-direct {v6, v4, v7, v5, v1}, LR3/l;-><init>(Lj3/M;LP5/F;LR3/r;Ljava/util/ArrayList;)V

    goto :goto_6d

    .line 312
    :cond_8c
    instance-of v6, v5, LR3/n;

    if-eqz v6, :cond_8d

    .line 313
    new-instance v6, LR3/k;

    check-cast v5, LR3/n;

    invoke-direct {v6, v4, v7, v5, v1}, LR3/k;-><init>(Lj3/M;LP5/F;LR3/n;Ljava/util/ArrayList;)V

    .line 314
    :goto_6d
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v41, 0x1

    add-int/lit8 v4, v35, 0x1

    move-object/from16 v92, v8

    move-object/from16 v1, v34

    move-wide/from16 v5, v136

    const/4 v7, 0x2

    const/4 v9, 0x4

    goto/16 :goto_60

    .line 315
    :cond_8d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8e
    move-wide/from16 v136, v5

    const/16 v43, -0x1

    .line 316
    new-instance v71, LR3/a;

    move-object/from16 v74, v3

    move-object/from16 v75, v76

    move-object/from16 v77, v79

    move-object/from16 v76, v126

    invoke-direct/range {v71 .. v77}, LR3/a;-><init>(IILjava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    move-object/from16 v1, v71

    move-object/from16 v5, v68

    .line 317
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v68, v5

    move-wide/from16 v7, v60

    move-wide/from16 v3, v106

    move-wide/from16 v5, v136

    const/16 v16, 0x2

    const/16 v33, 0x4

    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v41, 0x1

    goto/16 :goto_82

    :cond_8f
    move-object/from16 v34, v1

    move-wide/from16 v136, v5

    const/16 v43, -0x1

    move-object/from16 v87, v2

    move-object/from16 v65, v8

    move-object v5, v10

    move-object/from16 v70, v14

    move-object/from16 v89, v15

    move-object/from16 v86, v34

    move/from16 v6, v73

    move-object/from16 v10, v79

    move-object/from16 v7, v83

    move/from16 v2, v88

    move-object/from16 v96, v94

    move-object/from16 v15, v104

    move-object/from16 v14, v105

    move-wide/from16 v79, v106

    move-object/from16 v95, v109

    move/from16 v91, v115

    move-object/from16 v9, v127

    move-object/from16 v8, v128

    move-object/from16 v1, v132

    move-object/from16 v69, v134

    move-wide/from16 v34, v136

    move-wide/from16 v82, v11

    move-object/from16 v88, v13

    move-object/from16 v73, v50

    move-object/from16 v11, v76

    move-object/from16 v94, v93

    move-object/from16 v12, v101

    move-object/from16 v13, v126

    move-object/from16 v93, v90

    move-object/from16 v90, v75

    move-wide/from16 v75, v60

    goto/16 :goto_25

    :cond_90
    move/from16 v88, v2

    move-object/from16 v50, v3

    move-object/from16 v109, v4

    move-wide/from16 v60, v5

    move-wide/from16 v106, v7

    move-object/from16 v127, v9

    move-object/from16 v104, v15

    move-wide/from16 v136, v34

    move-object/from16 v5, v68

    move-object/from16 v134, v69

    const/16 v43, -0x1

    move-object v15, v13

    move-object v13, v14

    move-object v14, v12

    move-wide v11, v10

    .line 318
    const-string v1, "EventStream"

    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9f

    move-object/from16 v2, v49

    const/4 v7, 0x0

    .line 319
    invoke-interface {v0, v7, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_91

    move-object/from16 v69, v66

    :goto_6e
    move-object/from16 v3, v134

    goto :goto_6f

    :cond_91
    move-object/from16 v69, v3

    goto :goto_6e

    .line 320
    :goto_6f
    invoke-interface {v0, v7, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_92

    move-object/from16 v70, v66

    goto :goto_70

    :cond_92
    move-object/from16 v70, v4

    .line 321
    :goto_70
    const-string v4, "timescale"

    invoke-interface {v0, v7, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_93

    const-wide/16 v8, 0x1

    :goto_71
    move-wide/from16 v75, v8

    goto :goto_72

    .line 322
    :cond_93
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    goto :goto_71

    .line 323
    :goto_72
    const-string v4, "presentationTimeOffset"

    invoke-interface {v0, v7, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_94

    move-wide/from16 v6, v26

    goto :goto_73

    .line 324
    :cond_94
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 325
    :goto_73
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 326
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    const/16 v9, 0x200

    invoke-direct {v8, v9}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 327
    :goto_74
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 328
    const-string v9, "Event"

    invoke-static {v0, v9}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9c

    move-object/from16 v10, v109

    const/4 v13, 0x0

    .line 329
    invoke-interface {v0, v13, v10}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_95

    move-wide/from16 v14, v26

    :goto_75
    move-wide/from16 v82, v11

    move-object/from16 v12, v45

    goto :goto_76

    .line 330
    :cond_95
    invoke-static {v14}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v14

    goto :goto_75

    .line 331
    :goto_76
    invoke-interface {v0, v13, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_96

    const-wide v71, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_77

    .line 332
    :cond_96
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v34

    move-wide/from16 v71, v34

    .line 333
    :goto_77
    const-string v11, "presentationTime"

    invoke-interface {v0, v13, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_97

    move-wide/from16 v34, v26

    goto :goto_78

    .line 334
    :cond_97
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v34

    :goto_78
    const-wide/16 v73, 0x3e8

    .line 335
    invoke-static/range {v71 .. v76}, Ll4/y;->O(JJJ)J

    move-result-wide v65

    sub-long v71, v34, v6

    const-wide/32 v73, 0xf4240

    .line 336
    invoke-static/range {v71 .. v76}, Ll4/y;->O(JJJ)J

    move-result-wide v34

    move-wide/from16 v76, v75

    .line 337
    const-string v11, "messageData"

    const/4 v13, 0x0

    invoke-interface {v0, v13, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_98

    const/4 v11, 0x0

    .line 338
    :cond_98
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 339
    invoke-static {}, Landroid/util/Xml;->newSerializer()Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v13

    .line 340
    sget-object v45, LO5/e;->c:Ljava/nio/charset/Charset;

    move-object/from16 v49, v2

    invoke-virtual/range {v45 .. v45}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v13, v8, v2}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 341
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    .line 342
    :goto_79
    invoke-static {v0, v9}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_9a

    .line 343
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    packed-switch v2, :pswitch_data_2

    :goto_7a
    move-object/from16 v134, v3

    :cond_99
    :goto_7b
    move-object/from16 v45, v5

    move-wide/from16 v78, v6

    goto/16 :goto_7d

    .line 344
    :pswitch_b
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v13, v2}, Lorg/xmlpull/v1/XmlSerializer;->docdecl(Ljava/lang/String;)V

    goto :goto_7a

    .line 345
    :pswitch_c
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v13, v2}, Lorg/xmlpull/v1/XmlSerializer;->comment(Ljava/lang/String;)V

    goto :goto_7a

    .line 346
    :pswitch_d
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v13, v2}, Lorg/xmlpull/v1/XmlSerializer;->processingInstruction(Ljava/lang/String;)V

    goto :goto_7a

    .line 347
    :pswitch_e
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v13, v2}, Lorg/xmlpull/v1/XmlSerializer;->ignorableWhitespace(Ljava/lang/String;)V

    goto :goto_7a

    .line 348
    :pswitch_f
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v13, v2}, Lorg/xmlpull/v1/XmlSerializer;->entityRef(Ljava/lang/String;)V

    goto :goto_7a

    .line 349
    :pswitch_10
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v13, v2}, Lorg/xmlpull/v1/XmlSerializer;->cdsect(Ljava/lang/String;)V

    goto :goto_7a

    .line 350
    :pswitch_11
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v13, v2}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    goto :goto_7a

    .line 351
    :pswitch_12
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v134, v3

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v13, v2, v3}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    goto :goto_7b

    :pswitch_13
    move-object/from16 v134, v3

    .line 352
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v13, v2, v3}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    move/from16 v2, v42

    .line 353
    :goto_7c
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v3

    if-ge v2, v3, :cond_99

    .line 354
    invoke-interface {v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v45, v5

    invoke-interface {v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v5

    move-wide/from16 v78, v6

    invoke-interface {v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v6

    .line 355
    invoke-interface {v13, v3, v5, v6}, Lorg/xmlpull/v1/XmlSerializer;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const/16 v41, 0x1

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v5, v45

    move-wide/from16 v6, v78

    goto :goto_7c

    :pswitch_14
    move-object/from16 v134, v3

    move-object/from16 v45, v5

    move-wide/from16 v78, v6

    .line 356
    invoke-interface {v13}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    goto :goto_7d

    :pswitch_15
    move-object/from16 v134, v3

    move-object/from16 v45, v5

    move-wide/from16 v78, v6

    .line 357
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v7, 0x0

    invoke-interface {v13, v7, v2}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 358
    :goto_7d
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    move-object/from16 v5, v45

    move-wide/from16 v6, v78

    move-object/from16 v3, v134

    goto/16 :goto_79

    :cond_9a
    move-object/from16 v134, v3

    move-object/from16 v45, v5

    move-wide/from16 v78, v6

    .line 359
    invoke-interface {v13}, Lorg/xmlpull/v1/XmlSerializer;->flush()V

    .line 360
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    .line 361
    invoke-static/range {v34 .. v35}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    if-nez v11, :cond_9b

    :goto_7e
    move-object/from16 v75, v2

    goto :goto_7f

    .line 362
    :cond_9b
    sget-object v2, LO5/e;->c:Ljava/nio/charset/Charset;

    invoke-virtual {v11, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    goto :goto_7e

    .line 363
    :goto_7f
    new-instance v68, LF3/a;

    move-wide/from16 v73, v14

    move-wide/from16 v71, v65

    invoke-direct/range {v68 .. v75}, LF3/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    move-object/from16 v6, v68

    move-object/from16 v2, v69

    move-object/from16 v5, v70

    .line 364
    invoke-static {v3, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v3

    .line 365
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_80

    :cond_9c
    move-object/from16 v49, v2

    move-object/from16 v134, v3

    move-wide/from16 v78, v6

    move-wide/from16 v82, v11

    move-object/from16 v12, v45

    move-object/from16 v2, v69

    move-wide/from16 v76, v75

    move-object/from16 v10, v109

    move-object/from16 v45, v5

    move-object/from16 v5, v70

    .line 366
    invoke-static {v0}, LR3/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 367
    :goto_80
    invoke-static {v0, v1}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9e

    .line 368
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [J

    .line 369
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v3, v3, [LF3/a;

    move/from16 v6, v42

    .line 370
    :goto_81
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v6, v7, :cond_9d

    .line 371
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/util/Pair;

    .line 372
    iget-object v8, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    aput-wide v8, v1, v6

    .line 373
    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, LF3/a;

    aput-object v7, v3, v6

    const/16 v41, 0x1

    add-int/lit8 v6, v6, 0x1

    goto :goto_81

    :cond_9d
    const/16 v41, 0x1

    .line 374
    new-instance v4, LR3/g;

    invoke-direct {v4, v2, v5, v1, v3}, LR3/g;-><init>(Ljava/lang/String;Ljava/lang/String;[J[LF3/a;)V

    move-object/from16 v3, v57

    .line 375
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v57, v3

    move-object/from16 v109, v10

    move-object/from16 v68, v45

    move-wide/from16 v7, v60

    move-wide/from16 v3, v106

    move-wide/from16 v5, v136

    const/16 v16, 0x2

    const/16 v33, 0x4

    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v45, v12

    move-wide/from16 v11, v82

    goto/16 :goto_82

    :cond_9e
    const/16 v41, 0x1

    move-object/from16 v69, v2

    move-object/from16 v70, v5

    move-object/from16 v109, v10

    move-object/from16 v5, v45

    move-object/from16 v2, v49

    move-wide/from16 v75, v76

    move-wide/from16 v6, v78

    move-object/from16 v3, v134

    move-object/from16 v45, v12

    move-wide/from16 v11, v82

    goto/16 :goto_74

    :cond_9f
    move-wide/from16 v82, v11

    move-object/from16 v12, v45

    move-object/from16 v3, v57

    move-object/from16 v10, v109

    const/16 v41, 0x1

    move-object/from16 v45, v5

    .line 376
    invoke-static {v0, v15}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a0

    const/4 v7, 0x0

    .line 377
    invoke-static {v0, v7}, LR3/e;->p(Lorg/xmlpull/v1/XmlPullParser;LR3/r;)LR3/r;

    move-result-object v1

    move-object/from16 v59, v1

    move-object/from16 v57, v3

    move-object/from16 v109, v10

    move-object/from16 v68, v45

    move-wide/from16 v7, v60

    move-object/from16 v1, v64

    move-wide/from16 v3, v106

    move-wide/from16 v5, v136

    const/16 v16, 0x2

    const/16 v33, 0x4

    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v45, v12

    move-wide/from16 v11, v82

    goto/16 :goto_83

    .line 378
    :cond_a0
    invoke-static {v0, v13}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a1

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 379
    invoke-static {v0, v1, v2}, LR3/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v8

    move-wide/from16 v34, v1

    const/4 v1, 0x0

    move-object/from16 v57, v3

    move-object/from16 v109, v10

    move-object/from16 v68, v45

    move-wide/from16 v6, v60

    move-wide/from16 v10, v82

    move-wide/from16 v2, v106

    move-wide/from16 v4, v136

    const/16 v16, 0x2

    const/16 v33, 0x4

    .line 380
    invoke-static/range {v0 .. v11}, LR3/e;->q(Lorg/xmlpull/v1/XmlPullParser;LR3/o;JJJJJ)LR3/o;

    move-result-object v1

    move-wide v13, v8

    move-wide v7, v6

    move-wide v5, v4

    move-wide v3, v2

    move-object/from16 v59, v1

    move-object/from16 v45, v12

    move-wide/from16 v62, v13

    move-object/from16 v1, v64

    move-wide v11, v10

    goto :goto_83

    :cond_a1
    move-object/from16 v57, v3

    move-object/from16 v109, v10

    move-object/from16 v68, v45

    move-wide/from16 v7, v60

    move-wide/from16 v10, v82

    move-wide/from16 v3, v106

    move-wide/from16 v5, v136

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v16, 0x2

    const/16 v33, 0x4

    .line 381
    invoke-static {v0, v14}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_a2

    move-wide/from16 v82, v10

    .line 382
    invoke-static {v0, v1, v2}, LR3/e;->d(Lorg/xmlpull/v1/XmlPullParser;J)J

    move-result-wide v9

    .line 383
    sget-object v11, LP5/F;->b:LP5/D;

    move-wide/from16 v34, v1

    .line 384
    sget-object v2, LP5/S;->e:LP5/S;

    const/4 v1, 0x0

    move-object/from16 v45, v12

    move-wide/from16 v11, v82

    .line 385
    invoke-static/range {v0 .. v12}, LR3/e;->r(Lorg/xmlpull/v1/XmlPullParser;LR3/p;Ljava/util/List;JJJJJ)LR3/p;

    move-result-object v1

    move-object/from16 v59, v1

    move-wide/from16 v62, v9

    :goto_82
    move-object/from16 v1, v64

    goto :goto_83

    :cond_a2
    move-wide/from16 v34, v1

    move-object/from16 v45, v12

    move-wide v11, v10

    .line 386
    const-string v1, "AssetIdentifier"

    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a3

    .line 387
    invoke-static {v0, v1}, LR3/e;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)LR3/f;

    goto :goto_82

    .line 388
    :cond_a3
    invoke-static {v0}, LR3/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_82

    .line 389
    :goto_83
    invoke-static {v0, v1}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a7

    .line 390
    new-instance v45, LR3/h;

    move-object/from16 v50, v57

    move-object/from16 v49, v68

    invoke-direct/range {v45 .. v50}, LR3/h;-><init>(Ljava/lang/String;JLjava/util/ArrayList;Ljava/util/List;)V

    move-object/from16 v1, v45

    .line 391
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 392
    invoke-static {v1, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    .line 393
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, LR3/h;

    .line 394
    iget-wide v3, v2, LR3/h;->b:J

    cmp-long v3, v3, v34

    if-nez v3, :cond_a5

    if-eqz v23, :cond_a4

    move/from16 v36, v41

    move-object/from16 v9, v54

    move-wide/from16 v5, v55

    goto :goto_86

    .line 395
    :cond_a4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to determine start of period "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 396
    invoke-virtual/range {v54 .. v54}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v7, 0x0

    .line 397
    invoke-static {v0, v7}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    move-result-object v0

    throw v0

    .line 398
    :cond_a5
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v1, v3, v34

    if-nez v1, :cond_a6

    move-wide/from16 v5, v34

    :goto_84
    move-object/from16 v9, v54

    goto :goto_85

    .line 399
    :cond_a6
    iget-wide v5, v2, LR3/h;->b:J

    add-long/2addr v5, v3

    goto :goto_84

    .line 400
    :goto_85
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_86
    move-wide/from16 v7, v52

    goto :goto_87

    :cond_a7
    move-wide/from16 v34, v5

    move-wide v5, v7

    move-wide v10, v11

    move-object/from16 v13, v67

    move-object/from16 v14, v68

    move/from16 v2, v88

    move-object/from16 v15, v104

    move-object/from16 v9, v127

    move-object/from16 v12, v134

    move-wide v7, v3

    move-object/from16 v3, v50

    move-object/from16 v4, v109

    goto/16 :goto_1d

    :cond_a8
    move/from16 v88, v2

    move-wide/from16 v55, v5

    move-wide v11, v10

    move-object v9, v14

    const/16 v16, 0x2

    const/16 v33, 0x4

    const/16 v41, 0x1

    const/16 v43, -0x1

    .line 401
    invoke-static {v0}, LR3/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    move-wide/from16 v7, v52

    move-wide/from16 v5, v55

    .line 402
    :goto_87
    const-string v1, "MPD"

    invoke-static {v0, v1}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_ad

    cmp-long v0, v19, v34

    if-nez v0, :cond_a9

    cmp-long v0, v5, v34

    if-eqz v0, :cond_aa

    move-wide/from16 v19, v5

    :cond_a9
    :goto_88
    const/4 v1, 0x0

    goto :goto_89

    :cond_aa
    if-eqz v23, :cond_ab

    goto :goto_88

    .line 403
    :cond_ab
    const-string v0, "Unable to determine duration of static manifest."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    move-result-object v0

    throw v0

    .line 404
    :goto_89
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_ac

    .line 405
    new-instance v16, LR3/c;

    move-object/from16 v36, v9

    move-wide/from16 v26, v11

    move-object/from16 v32, v37

    move-object/from16 v33, v38

    move-object/from16 v35, v39

    move-object/from16 v34, v40

    invoke-direct/range {v16 .. v36}, LR3/c;-><init>(JJJZJJJJLR3/i;LR3/u;LR3/t;Landroid/net/Uri;Ljava/util/ArrayList;)V

    return-object v16

    .line 406
    :cond_ac
    const-string v0, "No periods found."

    invoke-static {v0, v1}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    move-result-object v0

    throw v0

    :cond_ad
    move-object v14, v9

    move-wide v10, v11

    move/from16 v12, v41

    move/from16 v1, v42

    move-object/from16 v13, v44

    move-object/from16 v3, v51

    move/from16 v2, v88

    const/4 v4, 0x0

    goto/16 :goto_b

    nop

    :pswitch_data_0
    .packed-switch 0x31
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch
.end method

.method public static m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)LR3/j;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v4

    .line 6
    invoke-interface {p0, v0, p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-wide/16 p1, -0x1

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    const-string v0, "-"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v0, 0x0

    .line 21
    aget-object v0, p0, v0

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    array-length v2, p0

    .line 28
    const/4 v3, 0x2

    .line 29
    if-ne v2, v3, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    aget-object p0, p0, p1

    .line 33
    .line 34
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    sub-long/2addr p0, v0

    .line 39
    const-wide/16 v2, 0x1

    .line 40
    .line 41
    add-long/2addr p0, v2

    .line 42
    move-wide v5, p0

    .line 43
    :goto_0
    move-wide v2, v0

    .line 44
    goto :goto_2

    .line 45
    :cond_0
    :goto_1
    move-wide v5, p1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const-wide/16 v0, 0x0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :goto_2
    new-instance v1, LR3/j;

    .line 51
    .line 52
    invoke-direct/range {v1 .. v6}, LR3/j;-><init>(JLjava/lang/String;J)V

    .line 53
    .line 54
    .line 55
    return-object v1
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method

.method public static n(Ljava/lang/String;)I
    .locals 7

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    const/4 v5, -0x1

    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v6

    .line 16
    sparse-switch v6, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :sswitch_0
    const-string v6, "supplementary"

    .line 22
    .line 23
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_1
    const/16 v5, 0xc

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :sswitch_1
    const-string v6, "emergency"

    .line 36
    .line 37
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_2

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_2
    const/16 v5, 0xb

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :sswitch_2
    const-string v6, "commentary"

    .line 50
    .line 51
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_3

    .line 56
    .line 57
    goto/16 :goto_0

    .line 58
    .line 59
    :cond_3
    const/16 v5, 0xa

    .line 60
    .line 61
    goto/16 :goto_0

    .line 62
    .line 63
    :sswitch_3
    const-string v6, "caption"

    .line 64
    .line 65
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_4

    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_4
    const/16 v5, 0x9

    .line 74
    .line 75
    goto/16 :goto_0

    .line 76
    .line 77
    :sswitch_4
    const-string v6, "sign"

    .line 78
    .line 79
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-nez p0, :cond_5

    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :cond_5
    move v5, v0

    .line 88
    goto/16 :goto_0

    .line 89
    .line 90
    :sswitch_5
    const-string v6, "main"

    .line 91
    .line 92
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-nez p0, :cond_6

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_6
    const/4 v5, 0x7

    .line 100
    goto :goto_0

    .line 101
    :sswitch_6
    const-string v6, "dub"

    .line 102
    .line 103
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-nez p0, :cond_7

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_7
    const/4 v5, 0x6

    .line 111
    goto :goto_0

    .line 112
    :sswitch_7
    const-string v6, "forced-subtitle"

    .line 113
    .line 114
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-nez p0, :cond_8

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_8
    const/4 v5, 0x5

    .line 122
    goto :goto_0

    .line 123
    :sswitch_8
    const-string v6, "alternate"

    .line 124
    .line 125
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-nez p0, :cond_9

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_9
    move v5, v1

    .line 133
    goto :goto_0

    .line 134
    :sswitch_9
    const-string v6, "forced_subtitle"

    .line 135
    .line 136
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-nez p0, :cond_a

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_a
    const/4 v5, 0x3

    .line 144
    goto :goto_0

    .line 145
    :sswitch_a
    const-string v6, "enhanced-audio-intelligibility"

    .line 146
    .line 147
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-nez p0, :cond_b

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_b
    move v5, v2

    .line 155
    goto :goto_0

    .line 156
    :sswitch_b
    const-string v6, "description"

    .line 157
    .line 158
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-nez p0, :cond_c

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_c
    move v5, v3

    .line 166
    goto :goto_0

    .line 167
    :sswitch_c
    const-string v6, "subtitle"

    .line 168
    .line 169
    invoke-virtual {p0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    if-nez p0, :cond_d

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_d
    move v5, v4

    .line 177
    :goto_0
    packed-switch v5, :pswitch_data_0

    .line 178
    .line 179
    .line 180
    :goto_1
    return v4

    .line 181
    :pswitch_0
    return v1

    .line 182
    :pswitch_1
    const/16 p0, 0x20

    .line 183
    .line 184
    return p0

    .line 185
    :pswitch_2
    return v0

    .line 186
    :pswitch_3
    const/16 p0, 0x40

    .line 187
    .line 188
    return p0

    .line 189
    :pswitch_4
    const/16 p0, 0x100

    .line 190
    .line 191
    return p0

    .line 192
    :pswitch_5
    return v3

    .line 193
    :pswitch_6
    const/16 p0, 0x10

    .line 194
    .line 195
    return p0

    .line 196
    :pswitch_7
    return v2

    .line 197
    :pswitch_8
    const/16 p0, 0x800

    .line 198
    .line 199
    return p0

    .line 200
    :pswitch_9
    const/16 p0, 0x200

    .line 201
    .line 202
    return p0

    .line 203
    :pswitch_a
    const/16 p0, 0x80

    .line 204
    .line 205
    return p0

    .line 206
    nop

    .line 207
    :sswitch_data_0
    .sparse-switch
        -0x7ad0b3e8 -> :sswitch_c
        -0x66ca7c04 -> :sswitch_b
        -0x5e3a5c50 -> :sswitch_a
        -0x5dde3142 -> :sswitch_9
        -0x53ecbf86 -> :sswitch_8
        -0x533bdf74 -> :sswitch_7
        0x185f1 -> :sswitch_6
        0x3305b9 -> :sswitch_5
        0x35ddbd -> :sswitch_4
        0x20ef99e6 -> :sswitch_3
        0x3597fba9 -> :sswitch_2
        0x6118c591 -> :sswitch_1
        0x6e96bb0f -> :sswitch_0
    .end sparse-switch

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_7
        :pswitch_a
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static o(Ljava/util/ArrayList;)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v0, v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, LR3/f;

    .line 14
    .line 15
    const-string v3, "http://dashif.org/guidelines/trickmode"

    .line 16
    .line 17
    iget-object v2, v2, LR3/f;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v3, v2}, LB6/u0;->w(Ljava/lang/String;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x4000

    .line 26
    .line 27
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return v1
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static p(Lorg/xmlpull/v1/XmlPullParser;LR3/r;)LR3/r;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v4, v1, LR3/s;->b:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v2

    .line 13
    :goto_0
    const/4 v6, 0x0

    .line 14
    const-string v7, "timescale"

    .line 15
    .line 16
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    if-nez v7, :cond_1

    .line 21
    .line 22
    :goto_1
    move-wide v9, v4

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    goto :goto_1

    .line 29
    :goto_2
    const-wide/16 v4, 0x0

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-wide v7, v1, LR3/s;->c:J

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_2
    move-wide v7, v4

    .line 37
    :goto_3
    const-string v11, "presentationTimeOffset"

    .line 38
    .line 39
    invoke-interface {v0, v6, v11}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v11

    .line 43
    if-nez v11, :cond_3

    .line 44
    .line 45
    :goto_4
    move-wide v11, v7

    .line 46
    goto :goto_5

    .line 47
    :cond_3
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    goto :goto_4

    .line 52
    :goto_5
    if-eqz v1, :cond_4

    .line 53
    .line 54
    iget-wide v7, v1, LR3/r;->d:J

    .line 55
    .line 56
    goto :goto_6

    .line 57
    :cond_4
    move-wide v7, v4

    .line 58
    :goto_6
    if-eqz v1, :cond_5

    .line 59
    .line 60
    iget-wide v4, v1, LR3/r;->e:J

    .line 61
    .line 62
    :cond_5
    const-string v13, "indexRange"

    .line 63
    .line 64
    invoke-interface {v0, v6, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    if-eqz v13, :cond_6

    .line 69
    .line 70
    const-string v4, "-"

    .line 71
    .line 72
    invoke-virtual {v13, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const/4 v5, 0x0

    .line 77
    aget-object v5, v4, v5

    .line 78
    .line 79
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    const/4 v5, 0x1

    .line 84
    aget-object v4, v4, v5

    .line 85
    .line 86
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    sub-long/2addr v4, v7

    .line 91
    add-long/2addr v4, v2

    .line 92
    :cond_6
    move-wide v15, v4

    .line 93
    move-wide v13, v7

    .line 94
    if-eqz v1, :cond_7

    .line 95
    .line 96
    iget-object v6, v1, LR3/s;->a:LR3/j;

    .line 97
    .line 98
    :cond_7
    :goto_7
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 99
    .line 100
    .line 101
    const-string v1, "Initialization"

    .line 102
    .line 103
    invoke-static {v0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_8

    .line 108
    .line 109
    const-string v1, "sourceURL"

    .line 110
    .line 111
    const-string v2, "range"

    .line 112
    .line 113
    invoke-static {v0, v1, v2}, LR3/e;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)LR3/j;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    :goto_8
    move-object v8, v6

    .line 118
    goto :goto_9

    .line 119
    :cond_8
    invoke-static {v0}, LR3/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 120
    .line 121
    .line 122
    goto :goto_8

    .line 123
    :goto_9
    const-string v1, "SegmentBase"

    .line 124
    .line 125
    invoke-static {v0, v1}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_9

    .line 130
    .line 131
    new-instance v7, LR3/r;

    .line 132
    .line 133
    invoke-direct/range {v7 .. v16}, LR3/r;-><init>(LR3/j;JJJJ)V

    .line 134
    .line 135
    .line 136
    return-object v7

    .line 137
    :cond_9
    move-object v6, v8

    .line 138
    goto :goto_7
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method

.method public static q(Lorg/xmlpull/v1/XmlPullParser;LR3/o;JJJJJ)LR3/o;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v4, v1, LR3/s;->b:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v2

    .line 13
    :goto_0
    const/4 v6, 0x0

    .line 14
    const-string v7, "timescale"

    .line 15
    .line 16
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    if-nez v7, :cond_1

    .line 21
    .line 22
    :goto_1
    move-wide v9, v4

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    goto :goto_1

    .line 29
    :goto_2
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-wide v4, v1, LR3/s;->c:J

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_2
    const-wide/16 v4, 0x0

    .line 35
    .line 36
    :goto_3
    const-string v7, "presentationTimeOffset"

    .line 37
    .line 38
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    if-nez v7, :cond_3

    .line 43
    .line 44
    :goto_4
    move-wide v11, v4

    .line 45
    goto :goto_5

    .line 46
    :cond_3
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    goto :goto_4

    .line 51
    :goto_5
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    iget-wide v7, v1, LR3/n;->e:J

    .line 59
    .line 60
    goto :goto_6

    .line 61
    :cond_4
    move-wide v7, v4

    .line 62
    :goto_6
    const-string v13, "duration"

    .line 63
    .line 64
    invoke-interface {v0, v6, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    if-nez v13, :cond_5

    .line 69
    .line 70
    :goto_7
    move-wide v15, v7

    .line 71
    goto :goto_8

    .line 72
    :cond_5
    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v7

    .line 76
    goto :goto_7

    .line 77
    :goto_8
    if-eqz v1, :cond_6

    .line 78
    .line 79
    iget-wide v2, v1, LR3/n;->d:J

    .line 80
    .line 81
    :cond_6
    const-string v7, "startNumber"

    .line 82
    .line 83
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    if-nez v7, :cond_7

    .line 88
    .line 89
    :goto_9
    move-wide v13, v2

    .line 90
    goto :goto_a

    .line 91
    :cond_7
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v2

    .line 95
    goto :goto_9

    .line 96
    :goto_a
    cmp-long v2, p8, v4

    .line 97
    .line 98
    if-nez v2, :cond_8

    .line 99
    .line 100
    move-wide/from16 v2, p6

    .line 101
    .line 102
    goto :goto_b

    .line 103
    :cond_8
    move-wide/from16 v2, p8

    .line 104
    .line 105
    :goto_b
    const-wide v7, 0x7fffffffffffffffL

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    cmp-long v7, v2, v7

    .line 111
    .line 112
    if-nez v7, :cond_9

    .line 113
    .line 114
    move-wide/from16 v18, v4

    .line 115
    .line 116
    goto :goto_c

    .line 117
    :cond_9
    move-wide/from16 v18, v2

    .line 118
    .line 119
    :goto_c
    move-object v2, v6

    .line 120
    move-object v3, v2

    .line 121
    :cond_a
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 122
    .line 123
    .line 124
    const-string v4, "Initialization"

    .line 125
    .line 126
    invoke-static {v0, v4}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_b

    .line 131
    .line 132
    const-string v2, "sourceURL"

    .line 133
    .line 134
    const-string v4, "range"

    .line 135
    .line 136
    invoke-static {v0, v2, v4}, LR3/e;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)LR3/j;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    move-wide/from16 v4, p4

    .line 141
    .line 142
    goto :goto_d

    .line 143
    :cond_b
    const-string v4, "SegmentTimeline"

    .line 144
    .line 145
    invoke-static {v0, v4}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_c

    .line 150
    .line 151
    move-wide/from16 v4, p4

    .line 152
    .line 153
    invoke-static {v0, v9, v10, v4, v5}, LR3/e;->s(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/ArrayList;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    goto :goto_d

    .line 158
    :cond_c
    move-wide/from16 v4, p4

    .line 159
    .line 160
    const-string v7, "SegmentURL"

    .line 161
    .line 162
    invoke-static {v0, v7}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-eqz v7, :cond_e

    .line 167
    .line 168
    if-nez v6, :cond_d

    .line 169
    .line 170
    new-instance v6, Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 173
    .line 174
    .line 175
    :cond_d
    const-string v7, "media"

    .line 176
    .line 177
    const-string v8, "mediaRange"

    .line 178
    .line 179
    invoke-static {v0, v7, v8}, LR3/e;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)LR3/j;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_d

    .line 187
    :cond_e
    invoke-static {v0}, LR3/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 188
    .line 189
    .line 190
    :goto_d
    const-string v7, "SegmentList"

    .line 191
    .line 192
    invoke-static {v0, v7}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    if-eqz v7, :cond_a

    .line 197
    .line 198
    if-eqz v1, :cond_12

    .line 199
    .line 200
    if-eqz v2, :cond_f

    .line 201
    .line 202
    goto :goto_e

    .line 203
    :cond_f
    iget-object v2, v1, LR3/s;->a:LR3/j;

    .line 204
    .line 205
    :goto_e
    if-eqz v3, :cond_10

    .line 206
    .line 207
    goto :goto_f

    .line 208
    :cond_10
    iget-object v3, v1, LR3/n;->f:Ljava/util/List;

    .line 209
    .line 210
    :goto_f
    if-eqz v6, :cond_11

    .line 211
    .line 212
    goto :goto_10

    .line 213
    :cond_11
    iget-object v6, v1, LR3/o;->j:Ljava/util/List;

    .line 214
    .line 215
    :cond_12
    :goto_10
    move-object v8, v2

    .line 216
    move-object/from16 v17, v3

    .line 217
    .line 218
    move-object/from16 v20, v6

    .line 219
    .line 220
    new-instance v7, LR3/o;

    .line 221
    .line 222
    invoke-static/range {p10 .. p11}, Ll4/y;->H(J)J

    .line 223
    .line 224
    .line 225
    move-result-wide v21

    .line 226
    invoke-static/range {p2 .. p3}, Ll4/y;->H(J)J

    .line 227
    .line 228
    .line 229
    move-result-wide v23

    .line 230
    invoke-direct/range {v7 .. v24}, LR3/o;-><init>(LR3/j;JJJJLjava/util/List;JLjava/util/List;JJ)V

    .line 231
    .line 232
    .line 233
    return-object v7
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
.end method

.method public static r(Lorg/xmlpull/v1/XmlPullParser;LR3/p;Ljava/util/List;JJJJJ)LR3/p;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-wide/16 v2, 0x1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v4, v1, LR3/s;->b:J

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-wide v4, v2

    .line 13
    :goto_0
    const/4 v6, 0x0

    .line 14
    const-string v7, "timescale"

    .line 15
    .line 16
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    if-nez v7, :cond_1

    .line 21
    .line 22
    :goto_1
    move-wide v9, v4

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    goto :goto_1

    .line 29
    :goto_2
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-wide v4, v1, LR3/s;->c:J

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_2
    const-wide/16 v4, 0x0

    .line 35
    .line 36
    :goto_3
    const-string v7, "presentationTimeOffset"

    .line 37
    .line 38
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    if-nez v7, :cond_3

    .line 43
    .line 44
    :goto_4
    move-wide v11, v4

    .line 45
    goto :goto_5

    .line 46
    :cond_3
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    goto :goto_4

    .line 51
    :goto_5
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    iget-wide v7, v1, LR3/n;->e:J

    .line 59
    .line 60
    goto :goto_6

    .line 61
    :cond_4
    move-wide v7, v4

    .line 62
    :goto_6
    const-string v13, "duration"

    .line 63
    .line 64
    invoke-interface {v0, v6, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    if-nez v13, :cond_5

    .line 69
    .line 70
    :goto_7
    move-wide/from16 v17, v7

    .line 71
    .line 72
    goto :goto_8

    .line 73
    :cond_5
    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v7

    .line 77
    goto :goto_7

    .line 78
    :goto_8
    if-eqz v1, :cond_6

    .line 79
    .line 80
    iget-wide v2, v1, LR3/n;->d:J

    .line 81
    .line 82
    :cond_6
    const-string v7, "startNumber"

    .line 83
    .line 84
    invoke-interface {v0, v6, v7}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    if-nez v7, :cond_7

    .line 89
    .line 90
    :goto_9
    move-wide v13, v2

    .line 91
    goto :goto_a

    .line 92
    :cond_7
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 93
    .line 94
    .line 95
    move-result-wide v2

    .line 96
    goto :goto_9

    .line 97
    :goto_a
    const/4 v2, 0x0

    .line 98
    :goto_b
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-ge v2, v3, :cond_9

    .line 103
    .line 104
    move-object/from16 v3, p2

    .line 105
    .line 106
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    check-cast v7, LR3/f;

    .line 111
    .line 112
    iget-object v8, v7, LR3/f;->a:Ljava/lang/String;

    .line 113
    .line 114
    const-string v15, "http://dashif.org/guidelines/last-segment-number"

    .line 115
    .line 116
    invoke-static {v15, v8}, LB6/u0;->w(Ljava/lang/String;Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-eqz v8, :cond_8

    .line 121
    .line 122
    iget-object v2, v7, LR3/f;->b:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v2

    .line 128
    :goto_c
    move-wide v15, v2

    .line 129
    goto :goto_d

    .line 130
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 131
    .line 132
    goto :goto_b

    .line 133
    :cond_9
    const-wide/16 v2, -0x1

    .line 134
    .line 135
    goto :goto_c

    .line 136
    :goto_d
    cmp-long v2, p9, v4

    .line 137
    .line 138
    if-nez v2, :cond_a

    .line 139
    .line 140
    move-wide/from16 v2, p7

    .line 141
    .line 142
    goto :goto_e

    .line 143
    :cond_a
    move-wide/from16 v2, p9

    .line 144
    .line 145
    :goto_e
    const-wide v7, 0x7fffffffffffffffL

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    cmp-long v7, v2, v7

    .line 151
    .line 152
    if-nez v7, :cond_b

    .line 153
    .line 154
    move-wide/from16 v20, v4

    .line 155
    .line 156
    goto :goto_f

    .line 157
    :cond_b
    move-wide/from16 v20, v2

    .line 158
    .line 159
    :goto_f
    if-eqz v1, :cond_c

    .line 160
    .line 161
    iget-object v2, v1, LR3/p;->k:LA4/q;

    .line 162
    .line 163
    goto :goto_10

    .line 164
    :cond_c
    move-object v2, v6

    .line 165
    :goto_10
    const-string v3, "media"

    .line 166
    .line 167
    invoke-static {v0, v3, v2}, LR3/e;->t(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;LA4/q;)LA4/q;

    .line 168
    .line 169
    .line 170
    move-result-object v23

    .line 171
    if-eqz v1, :cond_d

    .line 172
    .line 173
    iget-object v2, v1, LR3/p;->j:LA4/q;

    .line 174
    .line 175
    goto :goto_11

    .line 176
    :cond_d
    move-object v2, v6

    .line 177
    :goto_11
    const-string v3, "initialization"

    .line 178
    .line 179
    invoke-static {v0, v3, v2}, LR3/e;->t(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;LA4/q;)LA4/q;

    .line 180
    .line 181
    .line 182
    move-result-object v22

    .line 183
    move-object v2, v6

    .line 184
    :cond_e
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 185
    .line 186
    .line 187
    const-string v3, "Initialization"

    .line 188
    .line 189
    invoke-static {v0, v3}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-eqz v3, :cond_f

    .line 194
    .line 195
    const-string v3, "sourceURL"

    .line 196
    .line 197
    const-string v4, "range"

    .line 198
    .line 199
    invoke-static {v0, v3, v4}, LR3/e;->m(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)LR3/j;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    move-object v6, v3

    .line 204
    move-wide/from16 v3, p5

    .line 205
    .line 206
    goto :goto_12

    .line 207
    :cond_f
    const-string v3, "SegmentTimeline"

    .line 208
    .line 209
    invoke-static {v0, v3}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-eqz v3, :cond_10

    .line 214
    .line 215
    move-wide/from16 v3, p5

    .line 216
    .line 217
    invoke-static {v0, v9, v10, v3, v4}, LR3/e;->s(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/ArrayList;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    goto :goto_12

    .line 222
    :cond_10
    move-wide/from16 v3, p5

    .line 223
    .line 224
    invoke-static {v0}, LR3/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 225
    .line 226
    .line 227
    :goto_12
    const-string v5, "SegmentTemplate"

    .line 228
    .line 229
    invoke-static {v0, v5}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_e

    .line 234
    .line 235
    if-eqz v1, :cond_13

    .line 236
    .line 237
    if-eqz v6, :cond_11

    .line 238
    .line 239
    goto :goto_13

    .line 240
    :cond_11
    iget-object v6, v1, LR3/s;->a:LR3/j;

    .line 241
    .line 242
    :goto_13
    if-eqz v2, :cond_12

    .line 243
    .line 244
    goto :goto_14

    .line 245
    :cond_12
    iget-object v2, v1, LR3/n;->f:Ljava/util/List;

    .line 246
    .line 247
    :cond_13
    :goto_14
    move-object/from16 v19, v2

    .line 248
    .line 249
    move-object v8, v6

    .line 250
    new-instance v7, LR3/p;

    .line 251
    .line 252
    invoke-static/range {p11 .. p12}, Ll4/y;->H(J)J

    .line 253
    .line 254
    .line 255
    move-result-wide v24

    .line 256
    invoke-static/range {p3 .. p4}, Ll4/y;->H(J)J

    .line 257
    .line 258
    .line 259
    move-result-wide v26

    .line 260
    invoke-direct/range {v7 .. v27}, LR3/p;-><init>(LR3/j;JJJJJLjava/util/List;JLA4/q;LA4/q;JJ)V

    .line 261
    .line 262
    .line 263
    return-object v7
.end method

.method public static s(Lorg/xmlpull/v1/XmlPullParser;JJ)Ljava/util/ArrayList;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const/4 v11, 0x0

    .line 16
    move-wide v5, v9

    .line 17
    move v4, v11

    .line 18
    move v7, v4

    .line 19
    :cond_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 20
    .line 21
    .line 22
    const-string v8, "S"

    .line 23
    .line 24
    invoke-static {v0, v8}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    if-eqz v8, :cond_6

    .line 29
    .line 30
    const-string v8, "t"

    .line 31
    .line 32
    const/4 v12, 0x0

    .line 33
    invoke-interface {v0, v12, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    if-nez v8, :cond_1

    .line 38
    .line 39
    move-wide v13, v9

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v13

    .line 45
    :goto_0
    if-eqz v4, :cond_2

    .line 46
    .line 47
    move-wide v4, v5

    .line 48
    move v6, v7

    .line 49
    move-wide v7, v13

    .line 50
    invoke-static/range {v1 .. v8}, LR3/e;->a(Ljava/util/ArrayList;JJIJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move-wide v7, v13

    .line 56
    :goto_1
    cmp-long v4, v7, v9

    .line 57
    .line 58
    if-eqz v4, :cond_3

    .line 59
    .line 60
    move-wide v2, v7

    .line 61
    :cond_3
    const-string v4, "d"

    .line 62
    .line 63
    invoke-interface {v0, v12, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    if-nez v4, :cond_4

    .line 68
    .line 69
    move-wide v5, v9

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v4

    .line 75
    move-wide v5, v4

    .line 76
    :goto_2
    const-string v4, "r"

    .line 77
    .line 78
    invoke-interface {v0, v12, v4}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-nez v4, :cond_5

    .line 83
    .line 84
    move v7, v11

    .line 85
    goto :goto_3

    .line 86
    :cond_5
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    move v7, v4

    .line 91
    :goto_3
    const/4 v4, 0x1

    .line 92
    goto :goto_4

    .line 93
    :cond_6
    invoke-static {v0}, LR3/e;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 94
    .line 95
    .line 96
    :goto_4
    const-string v8, "SegmentTimeline"

    .line 97
    .line 98
    invoke-static {v0, v8}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_0

    .line 103
    .line 104
    if-eqz v4, :cond_7

    .line 105
    .line 106
    const-wide/16 v16, 0x3e8

    .line 107
    .line 108
    move-wide/from16 v14, p1

    .line 109
    .line 110
    move-wide/from16 v12, p3

    .line 111
    .line 112
    invoke-static/range {v12 .. v17}, Ll4/y;->O(JJJ)J

    .line 113
    .line 114
    .line 115
    move-result-wide v8

    .line 116
    move-object v0, v1

    .line 117
    move-wide v1, v2

    .line 118
    move-wide v3, v5

    .line 119
    move v5, v7

    .line 120
    move-wide v6, v8

    .line 121
    invoke-static/range {v0 .. v7}, LR3/e;->a(Ljava/util/ArrayList;JJIJ)J

    .line 122
    .line 123
    .line 124
    move-object v1, v0

    .line 125
    :cond_7
    return-object v1
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method

.method public static t(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;LA4/q;)LA4/q;
    .locals 17

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x0

    .line 6
    move-object/from16 v5, p0

    .line 7
    .line 8
    move-object/from16 v6, p1

    .line 9
    .line 10
    invoke-interface {v5, v4, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    if-eqz v4, :cond_a

    .line 15
    .line 16
    const/4 v5, 0x5

    .line 17
    new-array v5, v5, [Ljava/lang/String;

    .line 18
    .line 19
    const/4 v6, 0x4

    .line 20
    new-array v7, v6, [I

    .line 21
    .line 22
    new-array v8, v6, [Ljava/lang/String;

    .line 23
    .line 24
    const-string v9, ""

    .line 25
    .line 26
    aput-object v9, v5, v1

    .line 27
    .line 28
    move v10, v1

    .line 29
    move v11, v10

    .line 30
    :goto_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v12

    .line 34
    if-ge v10, v12, :cond_9

    .line 35
    .line 36
    const-string v12, "$"

    .line 37
    .line 38
    invoke-virtual {v4, v12, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 39
    .line 40
    .line 41
    move-result v13

    .line 42
    if-ne v13, v0, :cond_0

    .line 43
    .line 44
    new-instance v12, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    aget-object v13, v5, v11

    .line 50
    .line 51
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    aput-object v10, v5, v11

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    goto/16 :goto_6

    .line 72
    .line 73
    :cond_0
    if-eq v13, v10, :cond_1

    .line 74
    .line 75
    new-instance v12, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    aget-object v14, v5, v11

    .line 81
    .line 82
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v10, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    aput-object v10, v5, v11

    .line 97
    .line 98
    move v10, v13

    .line 99
    goto/16 :goto_6

    .line 100
    .line 101
    :cond_1
    const-string v13, "$$"

    .line 102
    .line 103
    invoke-virtual {v4, v13, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 104
    .line 105
    .line 106
    move-result v13

    .line 107
    if-eqz v13, :cond_2

    .line 108
    .line 109
    new-instance v13, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    aget-object v14, v5, v11

    .line 115
    .line 116
    invoke-static {v13, v14, v12}, Lcom/google/android/gms/internal/measurement/k1;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    aput-object v12, v5, v11

    .line 121
    .line 122
    add-int/2addr v10, v2

    .line 123
    goto/16 :goto_6

    .line 124
    .line 125
    :cond_2
    add-int/2addr v10, v3

    .line 126
    invoke-virtual {v4, v12, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    invoke-virtual {v4, v10, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    const-string v13, "RepresentationID"

    .line 135
    .line 136
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v13

    .line 140
    if-eqz v13, :cond_3

    .line 141
    .line 142
    aput v3, v7, v11

    .line 143
    .line 144
    goto/16 :goto_5

    .line 145
    .line 146
    :cond_3
    const-string v13, "%0"

    .line 147
    .line 148
    invoke-virtual {v10, v13}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    if-eq v13, v0, :cond_5

    .line 153
    .line 154
    invoke-virtual {v10, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    const-string v15, "d"

    .line 159
    .line 160
    invoke-virtual {v14, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 161
    .line 162
    .line 163
    move-result v16

    .line 164
    if-nez v16, :cond_4

    .line 165
    .line 166
    const-string v0, "x"

    .line 167
    .line 168
    invoke-virtual {v14, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-nez v0, :cond_4

    .line 173
    .line 174
    const-string v0, "X"

    .line 175
    .line 176
    invoke-virtual {v14, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-nez v0, :cond_4

    .line 181
    .line 182
    invoke-virtual {v14, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    :cond_4
    invoke-virtual {v10, v1, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    goto :goto_1

    .line 191
    :cond_5
    const-string v14, "%01d"

    .line 192
    .line 193
    :goto_1
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    sparse-switch v0, :sswitch_data_0

    .line 201
    .line 202
    .line 203
    :goto_2
    const/4 v0, -0x1

    .line 204
    goto :goto_3

    .line 205
    :sswitch_0
    const-string v0, "Bandwidth"

    .line 206
    .line 207
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-nez v0, :cond_6

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_6
    move v0, v2

    .line 215
    goto :goto_3

    .line 216
    :sswitch_1
    const-string v0, "Time"

    .line 217
    .line 218
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-nez v0, :cond_7

    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_7
    move v0, v3

    .line 226
    goto :goto_3

    .line 227
    :sswitch_2
    const-string v0, "Number"

    .line 228
    .line 229
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-nez v0, :cond_8

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_8
    move v0, v1

    .line 237
    :goto_3
    packed-switch v0, :pswitch_data_0

    .line 238
    .line 239
    .line 240
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 241
    .line 242
    const-string v1, "Invalid template: "

    .line 243
    .line 244
    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v0

    .line 252
    :pswitch_0
    const/4 v0, 0x3

    .line 253
    aput v0, v7, v11

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :pswitch_1
    aput v6, v7, v11

    .line 257
    .line 258
    goto :goto_4

    .line 259
    :pswitch_2
    aput v2, v7, v11

    .line 260
    .line 261
    :goto_4
    aput-object v14, v8, v11

    .line 262
    .line 263
    :goto_5
    add-int/2addr v11, v3

    .line 264
    aput-object v9, v5, v11

    .line 265
    .line 266
    add-int/2addr v12, v3

    .line 267
    move v10, v12

    .line 268
    :goto_6
    const/4 v0, -0x1

    .line 269
    goto/16 :goto_0

    .line 270
    .line 271
    :cond_9
    new-instance v0, LA4/q;

    .line 272
    .line 273
    invoke-direct {v0, v5, v7, v8, v11}, LA4/q;-><init>([Ljava/lang/String;[I[Ljava/lang/String;I)V

    .line 274
    .line 275
    .line 276
    return-object v0

    .line 277
    :cond_a
    return-object p2

    .line 278
    nop

    .line 279
    :sswitch_data_0
    .sparse-switch
        -0x74423897 -> :sswitch_2
        0x27c6ed -> :sswitch_1
        0x246e091 -> :sswitch_0
    .end sparse-switch

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
.end method


# virtual methods
.method public final k(Landroid/net/Uri;Lk4/o;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, LR3/e;->a:Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 3
    .line 4
    invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {v1, p2, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/4 v2, 0x2

    .line 16
    if-ne p2, v2, :cond_0

    .line 17
    .line 18
    const-string p2, "MPD"

    .line 19
    .line 20
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    invoke-static {v1, p1}, LR3/e;->l(Lorg/xmlpull/v1/XmlPullParser;Landroid/net/Uri;)LR3/c;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :catch_0
    move-exception p1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p1, "inputStream does not contain a valid media presentation description"

    .line 38
    .line 39
    invoke-static {p1, v0}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    throw p1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    :goto_0
    invoke-static {v0, p1}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    throw p1
    .line 49
    .line 50
    .line 51
    .line 52
.end method
