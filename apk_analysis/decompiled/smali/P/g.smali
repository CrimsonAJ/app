.class public final LP/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LP/h;

.field public c:Landroid/view/VelocityTracker;

.field public d:F

.field public e:I

.field public f:I

.field public g:I

.field public final h:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;LP/h;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, LP/g;->e:I

    .line 6
    .line 7
    iput v0, p0, LP/g;->f:I

    .line 8
    .line 9
    iput v0, p0, LP/g;->g:I

    .line 10
    .line 11
    const v0, 0x7fffffff

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    filled-new-array {v0, v1}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, LP/g;->h:[I

    .line 20
    .line 21
    iput-object p1, p0, LP/g;->a:Landroid/content/Context;

    .line 22
    .line 23
    iput-object p2, p0, LP/g;->b:LP/h;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
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
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;I)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 8
    .line 9
    .line 10
    move-result v5

    .line 11
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    iget v7, v0, LP/g;->f:I

    .line 16
    .line 17
    iget-object v8, v0, LP/g;->h:[I

    .line 18
    .line 19
    const/16 v11, 0x22

    .line 20
    .line 21
    const/high16 v12, 0x400000

    .line 22
    .line 23
    if-ne v7, v5, :cond_1

    .line 24
    .line 25
    iget v7, v0, LP/g;->g:I

    .line 26
    .line 27
    if-ne v7, v6, :cond_1

    .line 28
    .line 29
    iget v7, v0, LP/g;->e:I

    .line 30
    .line 31
    if-eq v7, v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v9, 0x0

    .line 35
    const/16 v16, 0x1

    .line 36
    .line 37
    const/16 v17, 0x14

    .line 38
    .line 39
    const/16 v18, 0x0

    .line 40
    .line 41
    goto/16 :goto_8

    .line 42
    .line 43
    :cond_1
    :goto_0
    iget-object v7, v0, LP/g;->a:Landroid/content/Context;

    .line 44
    .line 45
    invoke-static {v7}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 46
    .line 47
    .line 48
    move-result-object v14

    .line 49
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    const/16 v16, 0x1

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/16 v17, 0x14

    .line 60
    .line 61
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 v18, 0x0

    .line 64
    .line 65
    const-string v9, "android"

    .line 66
    .line 67
    const-string v10, "dimen"

    .line 68
    .line 69
    const/4 v13, -0x1

    .line 70
    if-lt v3, v11, :cond_2

    .line 71
    .line 72
    sget-object v20, LP/S;->a:Ljava/lang/reflect/Method;

    .line 73
    .line 74
    invoke-static {v14, v15, v2, v4}, LP/z;->g(Landroid/view/ViewConfiguration;III)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    goto :goto_3

    .line 79
    :cond_2
    sget-object v20, LP/S;->a:Ljava/lang/reflect/Method;

    .line 80
    .line 81
    invoke-static {v15}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    .line 82
    .line 83
    .line 84
    move-result-object v15

    .line 85
    if-eqz v15, :cond_5

    .line 86
    .line 87
    invoke-virtual {v15, v2, v4}, Landroid/view/InputDevice;->getMotionRange(II)Landroid/view/InputDevice$MotionRange;

    .line 88
    .line 89
    .line 90
    move-result-object v15

    .line 91
    if-eqz v15, :cond_5

    .line 92
    .line 93
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v15

    .line 97
    if-ne v4, v12, :cond_3

    .line 98
    .line 99
    const/16 v4, 0x1a

    .line 100
    .line 101
    if-ne v2, v4, :cond_3

    .line 102
    .line 103
    const-string v4, "config_viewMinRotaryEncoderFlingVelocity"

    .line 104
    .line 105
    invoke-virtual {v15, v4, v10, v9}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    goto :goto_1

    .line 110
    :cond_3
    move v4, v13

    .line 111
    :goto_1
    invoke-static {v14}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    if-eq v4, v13, :cond_4

    .line 115
    .line 116
    if-eqz v4, :cond_5

    .line 117
    .line 118
    invoke-virtual {v15, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-gez v4, :cond_6

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_4
    invoke-virtual {v14}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    goto :goto_3

    .line 130
    :cond_5
    :goto_2
    const v4, 0x7fffffff

    .line 131
    .line 132
    .line 133
    :cond_6
    :goto_3
    aput v4, v8, v18

    .line 134
    .line 135
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 140
    .line 141
    .line 142
    move-result v15

    .line 143
    if-lt v3, v11, :cond_7

    .line 144
    .line 145
    invoke-static {v14, v4, v2, v15}, LP/z;->f(Landroid/view/ViewConfiguration;III)I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    goto :goto_7

    .line 150
    :cond_7
    invoke-static {v4}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    if-eqz v3, :cond_8

    .line 155
    .line 156
    invoke-virtual {v3, v2, v15}, Landroid/view/InputDevice;->getMotionRange(II)Landroid/view/InputDevice$MotionRange;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    if-eqz v3, :cond_8

    .line 161
    .line 162
    move/from16 v3, v16

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_8
    move/from16 v3, v18

    .line 166
    .line 167
    :goto_4
    const/high16 v4, -0x80000000

    .line 168
    .line 169
    if-nez v3, :cond_a

    .line 170
    .line 171
    :cond_9
    :goto_5
    move v3, v4

    .line 172
    goto :goto_7

    .line 173
    :cond_a
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    if-ne v15, v12, :cond_b

    .line 178
    .line 179
    const/16 v7, 0x1a

    .line 180
    .line 181
    if-ne v2, v7, :cond_b

    .line 182
    .line 183
    const-string v7, "config_viewMaxRotaryEncoderFlingVelocity"

    .line 184
    .line 185
    invoke-virtual {v3, v7, v10, v9}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    goto :goto_6

    .line 190
    :cond_b
    move v7, v13

    .line 191
    :goto_6
    invoke-static {v14}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    if-eq v7, v13, :cond_c

    .line 195
    .line 196
    if-eqz v7, :cond_9

    .line 197
    .line 198
    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-gez v3, :cond_d

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_c
    invoke-virtual {v14}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    :cond_d
    :goto_7
    aput v3, v8, v16

    .line 210
    .line 211
    iput v5, v0, LP/g;->f:I

    .line 212
    .line 213
    iput v6, v0, LP/g;->g:I

    .line 214
    .line 215
    iput v2, v0, LP/g;->e:I

    .line 216
    .line 217
    move/from16 v9, v16

    .line 218
    .line 219
    :goto_8
    aget v3, v8, v18

    .line 220
    .line 221
    const v4, 0x7fffffff

    .line 222
    .line 223
    .line 224
    if-ne v3, v4, :cond_e

    .line 225
    .line 226
    iget-object v1, v0, LP/g;->c:Landroid/view/VelocityTracker;

    .line 227
    .line 228
    if-eqz v1, :cond_29

    .line 229
    .line 230
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 231
    .line 232
    .line 233
    const/4 v1, 0x0

    .line 234
    iput-object v1, v0, LP/g;->c:Landroid/view/VelocityTracker;

    .line 235
    .line 236
    return-void

    .line 237
    :cond_e
    iget-object v3, v0, LP/g;->c:Landroid/view/VelocityTracker;

    .line 238
    .line 239
    if-nez v3, :cond_f

    .line 240
    .line 241
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    iput-object v3, v0, LP/g;->c:Landroid/view/VelocityTracker;

    .line 246
    .line 247
    :cond_f
    iget-object v3, v0, LP/g;->c:Landroid/view/VelocityTracker;

    .line 248
    .line 249
    sget-object v4, LP/A;->a:Ljava/util/Map;

    .line 250
    .line 251
    invoke-virtual {v3, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 252
    .line 253
    .line 254
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 255
    .line 256
    const/4 v5, 0x0

    .line 257
    if-lt v4, v11, :cond_10

    .line 258
    .line 259
    goto :goto_9

    .line 260
    :cond_10
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    if-ne v4, v12, :cond_14

    .line 265
    .line 266
    sget-object v4, LP/A;->a:Ljava/util/Map;

    .line 267
    .line 268
    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    if-nez v6, :cond_11

    .line 273
    .line 274
    new-instance v6, LP/B;

    .line 275
    .line 276
    invoke-direct {v6}, LP/B;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-interface {v4, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    :cond_11
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    check-cast v4, LP/B;

    .line 287
    .line 288
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 292
    .line 293
    .line 294
    move-result-wide v6

    .line 295
    iget v10, v4, LP/B;->d:I

    .line 296
    .line 297
    iget-object v12, v4, LP/B;->b:[J

    .line 298
    .line 299
    if-eqz v10, :cond_12

    .line 300
    .line 301
    iget v10, v4, LP/B;->e:I

    .line 302
    .line 303
    aget-wide v13, v12, v10

    .line 304
    .line 305
    sub-long v13, v6, v13

    .line 306
    .line 307
    const-wide/16 v20, 0x28

    .line 308
    .line 309
    cmp-long v10, v13, v20

    .line 310
    .line 311
    if-lez v10, :cond_12

    .line 312
    .line 313
    move/from16 v10, v18

    .line 314
    .line 315
    iput v10, v4, LP/B;->d:I

    .line 316
    .line 317
    iput v5, v4, LP/B;->c:F

    .line 318
    .line 319
    :cond_12
    iget v10, v4, LP/B;->e:I

    .line 320
    .line 321
    add-int/lit8 v10, v10, 0x1

    .line 322
    .line 323
    rem-int/lit8 v10, v10, 0x14

    .line 324
    .line 325
    iput v10, v4, LP/B;->e:I

    .line 326
    .line 327
    iget v13, v4, LP/B;->d:I

    .line 328
    .line 329
    move/from16 v14, v17

    .line 330
    .line 331
    if-eq v13, v14, :cond_13

    .line 332
    .line 333
    add-int/lit8 v13, v13, 0x1

    .line 334
    .line 335
    iput v13, v4, LP/B;->d:I

    .line 336
    .line 337
    :cond_13
    const/16 v13, 0x1a

    .line 338
    .line 339
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    iget-object v13, v4, LP/B;->a:[F

    .line 344
    .line 345
    aput v1, v13, v10

    .line 346
    .line 347
    iget v1, v4, LP/B;->e:I

    .line 348
    .line 349
    aput-wide v6, v12, v1

    .line 350
    .line 351
    :cond_14
    :goto_9
    const/16 v1, 0x3e8

    .line 352
    .line 353
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 354
    .line 355
    .line 356
    invoke-virtual {v3, v1, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 357
    .line 358
    .line 359
    sget-object v6, LP/A;->a:Ljava/util/Map;

    .line 360
    .line 361
    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    check-cast v6, LP/B;

    .line 366
    .line 367
    if-eqz v6, :cond_20

    .line 368
    .line 369
    iget v7, v6, LP/B;->d:I

    .line 370
    .line 371
    const/4 v10, 0x2

    .line 372
    if-ge v7, v10, :cond_15

    .line 373
    .line 374
    :goto_a
    move/from16 p1, v4

    .line 375
    .line 376
    move v7, v5

    .line 377
    move/from16 v24, v7

    .line 378
    .line 379
    goto/16 :goto_e

    .line 380
    .line 381
    :cond_15
    iget v12, v6, LP/B;->e:I

    .line 382
    .line 383
    const/16 v17, 0x14

    .line 384
    .line 385
    add-int/lit8 v13, v12, 0x14

    .line 386
    .line 387
    add-int/lit8 v7, v7, -0x1

    .line 388
    .line 389
    sub-int/2addr v13, v7

    .line 390
    rem-int/lit8 v13, v13, 0x14

    .line 391
    .line 392
    iget-object v7, v6, LP/B;->b:[J

    .line 393
    .line 394
    aget-wide v14, v7, v12

    .line 395
    .line 396
    :goto_b
    aget-wide v20, v7, v13

    .line 397
    .line 398
    sub-long v22, v14, v20

    .line 399
    .line 400
    const-wide/16 v24, 0x64

    .line 401
    .line 402
    cmp-long v12, v22, v24

    .line 403
    .line 404
    if-lez v12, :cond_16

    .line 405
    .line 406
    iget v12, v6, LP/B;->d:I

    .line 407
    .line 408
    add-int/lit8 v12, v12, -0x1

    .line 409
    .line 410
    iput v12, v6, LP/B;->d:I

    .line 411
    .line 412
    add-int/lit8 v13, v13, 0x1

    .line 413
    .line 414
    const/16 v17, 0x14

    .line 415
    .line 416
    rem-int/lit8 v13, v13, 0x14

    .line 417
    .line 418
    goto :goto_b

    .line 419
    :cond_16
    const/16 v17, 0x14

    .line 420
    .line 421
    iget v12, v6, LP/B;->d:I

    .line 422
    .line 423
    if-ge v12, v10, :cond_17

    .line 424
    .line 425
    goto :goto_a

    .line 426
    :cond_17
    iget-object v14, v6, LP/B;->a:[F

    .line 427
    .line 428
    if-ne v12, v10, :cond_19

    .line 429
    .line 430
    add-int/lit8 v13, v13, 0x1

    .line 431
    .line 432
    rem-int/lit8 v13, v13, 0x14

    .line 433
    .line 434
    aget-wide v22, v7, v13

    .line 435
    .line 436
    cmp-long v7, v20, v22

    .line 437
    .line 438
    if-nez v7, :cond_18

    .line 439
    .line 440
    goto :goto_a

    .line 441
    :cond_18
    aget v7, v14, v13

    .line 442
    .line 443
    sub-long v12, v22, v20

    .line 444
    .line 445
    long-to-float v10, v12

    .line 446
    div-float/2addr v7, v10

    .line 447
    move/from16 p1, v4

    .line 448
    .line 449
    move/from16 v24, v5

    .line 450
    .line 451
    goto/16 :goto_e

    .line 452
    .line 453
    :cond_19
    move/from16 p1, v4

    .line 454
    .line 455
    move v15, v5

    .line 456
    const/4 v10, 0x0

    .line 457
    const/4 v12, 0x0

    .line 458
    :goto_c
    iget v4, v6, LP/B;->d:I

    .line 459
    .line 460
    add-int/lit8 v4, v4, -0x1

    .line 461
    .line 462
    const/high16 v19, 0x40000000    # 2.0f

    .line 463
    .line 464
    const/high16 v20, 0x3f800000    # 1.0f

    .line 465
    .line 466
    const/high16 v21, -0x40800000    # -1.0f

    .line 467
    .line 468
    if-ge v10, v4, :cond_1d

    .line 469
    .line 470
    add-int v4, v10, v13

    .line 471
    .line 472
    const/16 v17, 0x14

    .line 473
    .line 474
    rem-int/lit8 v22, v4, 0x14

    .line 475
    .line 476
    aget-wide v22, v7, v22

    .line 477
    .line 478
    add-int/lit8 v4, v4, 0x1

    .line 479
    .line 480
    rem-int/lit8 v4, v4, 0x14

    .line 481
    .line 482
    aget-wide v24, v7, v4

    .line 483
    .line 484
    cmp-long v24, v24, v22

    .line 485
    .line 486
    if-nez v24, :cond_1a

    .line 487
    .line 488
    move/from16 v24, v5

    .line 489
    .line 490
    move/from16 v1, v16

    .line 491
    .line 492
    goto :goto_d

    .line 493
    :cond_1a
    add-int/lit8 v12, v12, 0x1

    .line 494
    .line 495
    cmpg-float v24, v15, v5

    .line 496
    .line 497
    if-gez v24, :cond_1b

    .line 498
    .line 499
    move/from16 v20, v21

    .line 500
    .line 501
    :cond_1b
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    .line 502
    .line 503
    .line 504
    move-result v21

    .line 505
    move/from16 v24, v5

    .line 506
    .line 507
    mul-float v5, v21, v19

    .line 508
    .line 509
    float-to-double v1, v5

    .line 510
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 511
    .line 512
    .line 513
    move-result-wide v1

    .line 514
    double-to-float v1, v1

    .line 515
    mul-float v20, v20, v1

    .line 516
    .line 517
    aget v1, v14, v4

    .line 518
    .line 519
    aget-wide v4, v7, v4

    .line 520
    .line 521
    sub-long v4, v4, v22

    .line 522
    .line 523
    long-to-float v2, v4

    .line 524
    div-float/2addr v1, v2

    .line 525
    sub-float v2, v1, v20

    .line 526
    .line 527
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    mul-float/2addr v1, v2

    .line 532
    add-float/2addr v15, v1

    .line 533
    move/from16 v1, v16

    .line 534
    .line 535
    if-ne v12, v1, :cond_1c

    .line 536
    .line 537
    const/high16 v2, 0x3f000000    # 0.5f

    .line 538
    .line 539
    mul-float/2addr v15, v2

    .line 540
    :cond_1c
    :goto_d
    add-int/2addr v10, v1

    .line 541
    move/from16 v2, p2

    .line 542
    .line 543
    move/from16 v16, v1

    .line 544
    .line 545
    move/from16 v5, v24

    .line 546
    .line 547
    const/16 v1, 0x3e8

    .line 548
    .line 549
    goto :goto_c

    .line 550
    :cond_1d
    move/from16 v24, v5

    .line 551
    .line 552
    cmpg-float v1, v15, v24

    .line 553
    .line 554
    if-gez v1, :cond_1e

    .line 555
    .line 556
    move/from16 v20, v21

    .line 557
    .line 558
    :cond_1e
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    .line 559
    .line 560
    .line 561
    move-result v1

    .line 562
    mul-float v1, v1, v19

    .line 563
    .line 564
    float-to-double v1, v1

    .line 565
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 566
    .line 567
    .line 568
    move-result-wide v1

    .line 569
    double-to-float v1, v1

    .line 570
    mul-float v7, v20, v1

    .line 571
    .line 572
    const/16 v1, 0x3e8

    .line 573
    .line 574
    :goto_e
    int-to-float v1, v1

    .line 575
    mul-float/2addr v7, v1

    .line 576
    iput v7, v6, LP/B;->c:F

    .line 577
    .line 578
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    .line 579
    .line 580
    .line 581
    move-result v1

    .line 582
    neg-float v1, v1

    .line 583
    cmpg-float v1, v7, v1

    .line 584
    .line 585
    if-gez v1, :cond_1f

    .line 586
    .line 587
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    .line 588
    .line 589
    .line 590
    move-result v1

    .line 591
    neg-float v1, v1

    .line 592
    iput v1, v6, LP/B;->c:F

    .line 593
    .line 594
    goto :goto_f

    .line 595
    :cond_1f
    iget v1, v6, LP/B;->c:F

    .line 596
    .line 597
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    .line 598
    .line 599
    .line 600
    move-result v2

    .line 601
    cmpl-float v1, v1, v2

    .line 602
    .line 603
    if-lez v1, :cond_21

    .line 604
    .line 605
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    .line 606
    .line 607
    .line 608
    move-result v1

    .line 609
    iput v1, v6, LP/B;->c:F

    .line 610
    .line 611
    goto :goto_f

    .line 612
    :cond_20
    move/from16 v24, v5

    .line 613
    .line 614
    :cond_21
    :goto_f
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 615
    .line 616
    if-lt v1, v11, :cond_22

    .line 617
    .line 618
    move/from16 v2, p2

    .line 619
    .line 620
    invoke-static {v3, v2}, LP/z;->b(Landroid/view/VelocityTracker;I)F

    .line 621
    .line 622
    .line 623
    move-result v1

    .line 624
    goto :goto_11

    .line 625
    :cond_22
    move/from16 v2, p2

    .line 626
    .line 627
    if-nez v2, :cond_23

    .line 628
    .line 629
    invoke-virtual {v3}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 630
    .line 631
    .line 632
    move-result v1

    .line 633
    goto :goto_11

    .line 634
    :cond_23
    const/4 v1, 0x1

    .line 635
    if-ne v2, v1, :cond_24

    .line 636
    .line 637
    invoke-virtual {v3}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 638
    .line 639
    .line 640
    move-result v1

    .line 641
    goto :goto_11

    .line 642
    :cond_24
    sget-object v1, LP/A;->a:Ljava/util/Map;

    .line 643
    .line 644
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    check-cast v1, LP/B;

    .line 649
    .line 650
    if-eqz v1, :cond_26

    .line 651
    .line 652
    const/16 v13, 0x1a

    .line 653
    .line 654
    if-eq v2, v13, :cond_25

    .line 655
    .line 656
    goto :goto_10

    .line 657
    :cond_25
    iget v1, v1, LP/B;->c:F

    .line 658
    .line 659
    goto :goto_11

    .line 660
    :cond_26
    :goto_10
    move/from16 v1, v24

    .line 661
    .line 662
    :goto_11
    iget-object v2, v0, LP/g;->b:LP/h;

    .line 663
    .line 664
    invoke-interface {v2}, LP/h;->D()F

    .line 665
    .line 666
    .line 667
    move-result v3

    .line 668
    mul-float/2addr v3, v1

    .line 669
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 670
    .line 671
    .line 672
    move-result v1

    .line 673
    if-nez v9, :cond_27

    .line 674
    .line 675
    iget v4, v0, LP/g;->d:F

    .line 676
    .line 677
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 678
    .line 679
    .line 680
    move-result v4

    .line 681
    cmpl-float v4, v1, v4

    .line 682
    .line 683
    if-eqz v4, :cond_28

    .line 684
    .line 685
    cmpl-float v1, v1, v24

    .line 686
    .line 687
    if-eqz v1, :cond_28

    .line 688
    .line 689
    :cond_27
    invoke-interface {v2}, LP/h;->I()V

    .line 690
    .line 691
    .line 692
    :cond_28
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 693
    .line 694
    .line 695
    move-result v1

    .line 696
    const/16 v18, 0x0

    .line 697
    .line 698
    aget v4, v8, v18

    .line 699
    .line 700
    int-to-float v4, v4

    .line 701
    cmpg-float v1, v1, v4

    .line 702
    .line 703
    if-gez v1, :cond_2a

    .line 704
    .line 705
    :cond_29
    return-void

    .line 706
    :cond_2a
    const/16 v16, 0x1

    .line 707
    .line 708
    aget v1, v8, v16

    .line 709
    .line 710
    neg-int v4, v1

    .line 711
    int-to-float v4, v4

    .line 712
    int-to-float v1, v1

    .line 713
    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    .line 714
    .line 715
    .line 716
    move-result v1

    .line 717
    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    .line 718
    .line 719
    .line 720
    move-result v1

    .line 721
    invoke-interface {v2, v1}, LP/h;->p(F)Z

    .line 722
    .line 723
    .line 724
    move-result v2

    .line 725
    if-eqz v2, :cond_2b

    .line 726
    .line 727
    move v5, v1

    .line 728
    goto :goto_12

    .line 729
    :cond_2b
    move/from16 v5, v24

    .line 730
    .line 731
    :goto_12
    iput v5, v0, LP/g;->d:F

    .line 732
    .line 733
    return-void
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
.end method
