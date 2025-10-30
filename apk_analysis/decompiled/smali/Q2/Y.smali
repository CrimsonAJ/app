.class public final LQ2/Y;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements LQ2/P;


# instance fields
.field public final a:LQ2/c;

.field public final b:LQ2/W;

.field public c:Ljava/util/List;

.field public d:LQ2/d;

.field public e:F

.field public f:I

.field public g:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    .line 4
    .line 5
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v1, p0, LQ2/Y;->c:Ljava/util/List;

    .line 8
    .line 9
    sget-object v1, LQ2/d;->g:LQ2/d;

    .line 10
    .line 11
    iput-object v1, p0, LQ2/Y;->d:LQ2/d;

    .line 12
    .line 13
    const v1, 0x3d5a511a    # 0.0533f

    .line 14
    .line 15
    .line 16
    iput v1, p0, LQ2/Y;->e:F

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput v1, p0, LQ2/Y;->f:I

    .line 20
    .line 21
    const v2, 0x3da3d70a    # 0.08f

    .line 22
    .line 23
    .line 24
    iput v2, p0, LQ2/Y;->g:F

    .line 25
    .line 26
    new-instance v2, LQ2/c;

    .line 27
    .line 28
    invoke-direct {v2, p1}, LQ2/c;-><init>(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    iput-object v2, p0, LQ2/Y;->a:LQ2/c;

    .line 32
    .line 33
    new-instance v3, LQ2/W;

    .line 34
    .line 35
    invoke-direct {v3, p1, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    .line 37
    .line 38
    iput-object v3, p0, LQ2/Y;->b:LQ2/W;

    .line 39
    .line 40
    invoke-virtual {v3, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    return-void
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


# virtual methods
.method public final a(Ljava/util/List;LQ2/d;FIF)V
    .locals 6

    .line 1
    iput-object p2, p0, LQ2/Y;->d:LQ2/d;

    .line 2
    .line 3
    iput p3, p0, LQ2/Y;->e:F

    .line 4
    .line 5
    iput p4, p0, LQ2/Y;->f:I

    .line 6
    .line 7
    iput p5, p0, LQ2/Y;->g:F

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-ge v2, v3, :cond_1

    .line 25
    .line 26
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, LY3/b;

    .line 31
    .line 32
    iget-object v4, v3, LY3/b;->d:Landroid/graphics/Bitmap;

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object p1, p0, LQ2/Y;->c:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    :cond_2
    iput-object v0, p0, LQ2/Y;->c:Ljava/util/List;

    .line 61
    .line 62
    invoke-virtual {p0}, LQ2/Y;->c()V

    .line 63
    .line 64
    .line 65
    :cond_3
    iget-object v0, p0, LQ2/Y;->a:LQ2/c;

    .line 66
    .line 67
    move-object v2, p2

    .line 68
    move v3, p3

    .line 69
    move v4, p4

    .line 70
    move v5, p5

    .line 71
    invoke-virtual/range {v0 .. v5}, LQ2/c;->a(Ljava/util/List;LQ2/d;FIF)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 75
    .line 76
    .line 77
    return-void
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

.method public final b(IF)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sub-int/2addr v1, v2

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    sub-int/2addr v1, v2

    .line 19
    invoke-static {p2, p1, v0, v1}, LZ0/a;->x(FIII)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const p2, -0x800001

    .line 24
    .line 25
    .line 26
    cmpl-float p2, p1, p2

    .line 27
    .line 28
    if-nez p2, :cond_0

    .line 29
    .line 30
    const-string p1, "unset"

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 46
    .line 47
    div-float/2addr p1, p2

    .line 48
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 p2, 0x1

    .line 53
    new-array p2, p2, [Ljava/lang/Object;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    aput-object p1, p2, v0

    .line 57
    .line 58
    sget p1, Ll4/y;->a:I

    .line 59
    .line 60
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 61
    .line 62
    const-string v0, "%.2fpx"

    .line 63
    .line 64
    invoke-static {p1, v0, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1
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
.end method

.method public final c()V
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x1

    .line 8
    new-instance v6, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v7, v0, LQ2/Y;->d:LQ2/d;

    .line 14
    .line 15
    iget v7, v7, LQ2/d;->a:I

    .line 16
    .line 17
    invoke-static {v7}, LO4/h;->L(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    iget v8, v0, LQ2/Y;->f:I

    .line 22
    .line 23
    iget v9, v0, LQ2/Y;->e:F

    .line 24
    .line 25
    invoke-virtual {v0, v8, v9}, LQ2/Y;->b(IF)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    const v9, 0x3f99999a    # 1.2f

    .line 30
    .line 31
    .line 32
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    iget-object v11, v0, LQ2/Y;->d:LQ2/d;

    .line 37
    .line 38
    iget v12, v11, LQ2/d;->d:I

    .line 39
    .line 40
    const-string v13, "unset"

    .line 41
    .line 42
    iget v11, v11, LQ2/d;->e:I

    .line 43
    .line 44
    if-eq v12, v5, :cond_3

    .line 45
    .line 46
    if-eq v12, v3, :cond_2

    .line 47
    .line 48
    if-eq v12, v2, :cond_1

    .line 49
    .line 50
    if-eq v12, v1, :cond_0

    .line 51
    .line 52
    move-object v11, v13

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {v11}, LO4/h;->L(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    sget v12, Ll4/y;->a:I

    .line 59
    .line 60
    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 61
    .line 62
    const-string v12, "-0.05em -0.05em 0.15em "

    .line 63
    .line 64
    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-static {v11}, LO4/h;->L(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v11

    .line 73
    sget v12, Ll4/y;->a:I

    .line 74
    .line 75
    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 76
    .line 77
    const-string v12, "0.06em 0.08em 0.15em "

    .line 78
    .line 79
    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    invoke-static {v11}, LO4/h;->L(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    sget v12, Ll4/y;->a:I

    .line 89
    .line 90
    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 91
    .line 92
    const-string v12, "0.1em 0.12em 0.15em "

    .line 93
    .line 94
    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    goto :goto_0

    .line 99
    :cond_3
    invoke-static {v11}, LO4/h;->L(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    new-array v12, v5, [Ljava/lang/Object;

    .line 104
    .line 105
    aput-object v11, v12, v4

    .line 106
    .line 107
    sget v11, Ll4/y;->a:I

    .line 108
    .line 109
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 110
    .line 111
    const-string v14, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s"

    .line 112
    .line 113
    invoke-static {v11, v14, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    :goto_0
    new-array v12, v1, [Ljava/lang/Object;

    .line 118
    .line 119
    aput-object v7, v12, v4

    .line 120
    .line 121
    aput-object v8, v12, v5

    .line 122
    .line 123
    aput-object v10, v12, v3

    .line 124
    .line 125
    aput-object v11, v12, v2

    .line 126
    .line 127
    sget v7, Ll4/y;->a:I

    .line 128
    .line 129
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 130
    .line 131
    const-string v8, "<body><div style=\'-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;\'>"

    .line 132
    .line 133
    invoke-static {v7, v8, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    new-instance v7, Ljava/util/HashMap;

    .line 141
    .line 142
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 143
    .line 144
    .line 145
    iget-object v8, v0, LQ2/Y;->d:LQ2/d;

    .line 146
    .line 147
    iget v8, v8, LQ2/d;->b:I

    .line 148
    .line 149
    invoke-static {v8}, LO4/h;->L(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    new-instance v10, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v11, "background-color:"

    .line 156
    .line 157
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v8, ";"

    .line 164
    .line 165
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    const-string v12, ".default_bg,.default_bg *"

    .line 173
    .line 174
    invoke-virtual {v7, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move v10, v4

    .line 178
    :goto_1
    iget-object v12, v0, LQ2/Y;->c:Ljava/util/List;

    .line 179
    .line 180
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    if-ge v10, v12, :cond_53

    .line 185
    .line 186
    iget-object v12, v0, LQ2/Y;->c:Ljava/util/List;

    .line 187
    .line 188
    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    check-cast v12, LY3/b;

    .line 193
    .line 194
    iget v14, v12, LY3/b;->h:F

    .line 195
    .line 196
    const v15, -0x800001

    .line 197
    .line 198
    .line 199
    cmpl-float v16, v14, v15

    .line 200
    .line 201
    const/high16 v17, 0x42c80000    # 100.0f

    .line 202
    .line 203
    if-eqz v16, :cond_4

    .line 204
    .line 205
    mul-float v14, v14, v17

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_4
    const/high16 v14, 0x42480000    # 50.0f

    .line 209
    .line 210
    :goto_2
    const/16 v16, -0x32

    .line 211
    .line 212
    const/16 v18, -0x64

    .line 213
    .line 214
    move/from16 v19, v1

    .line 215
    .line 216
    iget v1, v12, LY3/b;->i:I

    .line 217
    .line 218
    if-eq v1, v5, :cond_6

    .line 219
    .line 220
    if-eq v1, v3, :cond_5

    .line 221
    .line 222
    move v1, v4

    .line 223
    move/from16 v20, v9

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_5
    move/from16 v20, v9

    .line 227
    .line 228
    move/from16 v1, v18

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_6
    move/from16 v20, v9

    .line 232
    .line 233
    move/from16 v1, v16

    .line 234
    .line 235
    :goto_3
    iget v9, v12, LY3/b;->e:F

    .line 236
    .line 237
    cmpl-float v21, v9, v15

    .line 238
    .line 239
    const/high16 v22, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const/16 v23, 0x0

    .line 242
    .line 243
    move/from16 v24, v15

    .line 244
    .line 245
    const-string v15, "%.2f%%"

    .line 246
    .line 247
    iget v2, v12, LY3/b;->p:I

    .line 248
    .line 249
    if-eqz v21, :cond_e

    .line 250
    .line 251
    move/from16 v21, v4

    .line 252
    .line 253
    iget v4, v12, LY3/b;->f:I

    .line 254
    .line 255
    if-eq v4, v5, :cond_c

    .line 256
    .line 257
    mul-float v9, v9, v17

    .line 258
    .line 259
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    new-array v9, v5, [Ljava/lang/Object;

    .line 264
    .line 265
    aput-object v4, v9, v21

    .line 266
    .line 267
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 268
    .line 269
    invoke-static {v4, v15, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    iget v9, v12, LY3/b;->g:I

    .line 274
    .line 275
    if-ne v2, v5, :cond_9

    .line 276
    .line 277
    if-eq v9, v5, :cond_8

    .line 278
    .line 279
    if-eq v9, v3, :cond_7

    .line 280
    .line 281
    move/from16 v9, v21

    .line 282
    .line 283
    goto :goto_4

    .line 284
    :cond_7
    move/from16 v9, v18

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_8
    move/from16 v9, v16

    .line 288
    .line 289
    :goto_4
    neg-int v9, v9

    .line 290
    move/from16 v18, v9

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_9
    if-eq v9, v5, :cond_b

    .line 294
    .line 295
    if-eq v9, v3, :cond_a

    .line 296
    .line 297
    move/from16 v16, v21

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_a
    move/from16 v16, v18

    .line 301
    .line 302
    :cond_b
    :goto_5
    move/from16 v18, v16

    .line 303
    .line 304
    :goto_6
    move/from16 v3, v21

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_c
    cmpl-float v4, v9, v23

    .line 308
    .line 309
    const-string v3, "%.2fem"

    .line 310
    .line 311
    if-ltz v4, :cond_d

    .line 312
    .line 313
    mul-float v9, v9, v20

    .line 314
    .line 315
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    new-array v9, v5, [Ljava/lang/Object;

    .line 320
    .line 321
    aput-object v4, v9, v21

    .line 322
    .line 323
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 324
    .line 325
    invoke-static {v4, v3, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    move/from16 v3, v21

    .line 330
    .line 331
    move/from16 v18, v3

    .line 332
    .line 333
    goto :goto_7

    .line 334
    :cond_d
    neg-float v4, v9

    .line 335
    sub-float v4, v4, v22

    .line 336
    .line 337
    mul-float v4, v4, v20

    .line 338
    .line 339
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    new-array v9, v5, [Ljava/lang/Object;

    .line 344
    .line 345
    aput-object v4, v9, v21

    .line 346
    .line 347
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 348
    .line 349
    invoke-static {v4, v3, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    move v3, v5

    .line 354
    move/from16 v18, v21

    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_e
    move/from16 v21, v4

    .line 358
    .line 359
    iget v3, v0, LQ2/Y;->g:F

    .line 360
    .line 361
    sub-float v22, v22, v3

    .line 362
    .line 363
    mul-float v22, v22, v17

    .line 364
    .line 365
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    new-array v4, v5, [Ljava/lang/Object;

    .line 370
    .line 371
    aput-object v3, v4, v21

    .line 372
    .line 373
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 374
    .line 375
    invoke-static {v3, v15, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v4

    .line 379
    goto :goto_6

    .line 380
    :goto_7
    iget v9, v12, LY3/b;->j:F

    .line 381
    .line 382
    cmpl-float v22, v9, v24

    .line 383
    .line 384
    if-eqz v22, :cond_f

    .line 385
    .line 386
    mul-float v9, v9, v17

    .line 387
    .line 388
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 389
    .line 390
    .line 391
    move-result-object v9

    .line 392
    move/from16 v22, v1

    .line 393
    .line 394
    new-array v1, v5, [Ljava/lang/Object;

    .line 395
    .line 396
    aput-object v9, v1, v21

    .line 397
    .line 398
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 399
    .line 400
    invoke-static {v9, v15, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    goto :goto_8

    .line 405
    :cond_f
    move/from16 v22, v1

    .line 406
    .line 407
    const-string v1, "fit-content"

    .line 408
    .line 409
    :goto_8
    const-string v9, "start"

    .line 410
    .line 411
    const-string v15, "end"

    .line 412
    .line 413
    const-string v24, "center"

    .line 414
    .line 415
    iget-object v5, v12, LY3/b;->b:Landroid/text/Layout$Alignment;

    .line 416
    .line 417
    if-nez v5, :cond_10

    .line 418
    .line 419
    move-object/from16 v27, v1

    .line 420
    .line 421
    move/from16 v28, v3

    .line 422
    .line 423
    move-object/from16 v5, v24

    .line 424
    .line 425
    const/4 v1, 0x2

    .line 426
    :goto_9
    const/4 v3, 0x1

    .line 427
    goto :goto_a

    .line 428
    :cond_10
    sget-object v27, LQ2/X;->a:[I

    .line 429
    .line 430
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    aget v5, v27, v5

    .line 435
    .line 436
    move-object/from16 v27, v1

    .line 437
    .line 438
    const/4 v1, 0x1

    .line 439
    if-eq v5, v1, :cond_12

    .line 440
    .line 441
    const/4 v1, 0x2

    .line 442
    if-eq v5, v1, :cond_11

    .line 443
    .line 444
    move/from16 v28, v3

    .line 445
    .line 446
    move-object/from16 v5, v24

    .line 447
    .line 448
    goto :goto_9

    .line 449
    :cond_11
    move/from16 v28, v3

    .line 450
    .line 451
    move-object v5, v15

    .line 452
    goto :goto_9

    .line 453
    :cond_12
    const/4 v1, 0x2

    .line 454
    move/from16 v28, v3

    .line 455
    .line 456
    move-object v5, v9

    .line 457
    goto :goto_9

    .line 458
    :goto_a
    if-eq v2, v3, :cond_14

    .line 459
    .line 460
    if-eq v2, v1, :cond_13

    .line 461
    .line 462
    const-string v1, "horizontal-tb"

    .line 463
    .line 464
    goto :goto_b

    .line 465
    :cond_13
    const-string v1, "vertical-lr"

    .line 466
    .line 467
    goto :goto_b

    .line 468
    :cond_14
    const-string v1, "vertical-rl"

    .line 469
    .line 470
    :goto_b
    iget v3, v12, LY3/b;->n:I

    .line 471
    .line 472
    move-object/from16 v29, v1

    .line 473
    .line 474
    iget v1, v12, LY3/b;->o:F

    .line 475
    .line 476
    invoke-virtual {v0, v3, v1}, LQ2/Y;->b(IF)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    iget-boolean v3, v12, LY3/b;->l:Z

    .line 481
    .line 482
    if-eqz v3, :cond_15

    .line 483
    .line 484
    iget v3, v12, LY3/b;->m:I

    .line 485
    .line 486
    goto :goto_c

    .line 487
    :cond_15
    iget-object v3, v0, LQ2/Y;->d:LQ2/d;

    .line 488
    .line 489
    iget v3, v3, LQ2/d;->c:I

    .line 490
    .line 491
    :goto_c
    invoke-static {v3}, LO4/h;->L(I)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    const-string v30, "right"

    .line 496
    .line 497
    const-string v31, "top"

    .line 498
    .line 499
    const-string v32, "left"

    .line 500
    .line 501
    move-object/from16 v33, v1

    .line 502
    .line 503
    const/4 v1, 0x1

    .line 504
    if-eq v2, v1, :cond_1a

    .line 505
    .line 506
    const/4 v1, 0x2

    .line 507
    if-eq v2, v1, :cond_18

    .line 508
    .line 509
    if-eqz v28, :cond_16

    .line 510
    .line 511
    const-string v31, "bottom"

    .line 512
    .line 513
    :cond_16
    move-object/from16 v30, v31

    .line 514
    .line 515
    move-object/from16 v31, v32

    .line 516
    .line 517
    :cond_17
    :goto_d
    const/4 v1, 0x2

    .line 518
    goto :goto_f

    .line 519
    :cond_18
    if-eqz v28, :cond_19

    .line 520
    .line 521
    goto :goto_d

    .line 522
    :cond_19
    :goto_e
    move-object/from16 v30, v32

    .line 523
    .line 524
    goto :goto_d

    .line 525
    :cond_1a
    if-eqz v28, :cond_17

    .line 526
    .line 527
    goto :goto_e

    .line 528
    :goto_f
    if-eq v2, v1, :cond_1c

    .line 529
    .line 530
    const/4 v1, 0x1

    .line 531
    if-ne v2, v1, :cond_1b

    .line 532
    .line 533
    goto :goto_10

    .line 534
    :cond_1b
    const-string v1, "width"

    .line 535
    .line 536
    move/from16 v49, v22

    .line 537
    .line 538
    move/from16 v22, v18

    .line 539
    .line 540
    move/from16 v18, v49

    .line 541
    .line 542
    goto :goto_11

    .line 543
    :cond_1c
    :goto_10
    const-string v1, "height"

    .line 544
    .line 545
    :goto_11
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 546
    .line 547
    .line 548
    move-result-object v28

    .line 549
    invoke-virtual/range {v28 .. v28}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 550
    .line 551
    .line 552
    move-result-object v28

    .line 553
    move-object/from16 v32, v1

    .line 554
    .line 555
    invoke-virtual/range {v28 .. v28}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 560
    .line 561
    sget-object v28, LQ2/l;->a:Ljava/util/regex/Pattern;

    .line 562
    .line 563
    move/from16 v28, v1

    .line 564
    .line 565
    const-string v1, "</span>"

    .line 566
    .line 567
    move-object/from16 v34, v3

    .line 568
    .line 569
    const-string v3, ";\'>"

    .line 570
    .line 571
    move-object/from16 v35, v4

    .line 572
    .line 573
    const-string v4, ""

    .line 574
    .line 575
    move-object/from16 v36, v5

    .line 576
    .line 577
    iget-object v5, v12, LY3/b;->a:Ljava/lang/CharSequence;

    .line 578
    .line 579
    if-nez v5, :cond_1d

    .line 580
    .line 581
    new-instance v5, LQ2/i;

    .line 582
    .line 583
    invoke-direct {v5, v4}, LQ2/i;-><init>(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    move-object/from16 v37, v4

    .line 587
    .line 588
    :goto_12
    move-object/from16 v41, v8

    .line 589
    .line 590
    move-object/from16 v38, v9

    .line 591
    .line 592
    move/from16 v39, v10

    .line 593
    .line 594
    move-object/from16 v46, v11

    .line 595
    .line 596
    move/from16 v40, v14

    .line 597
    .line 598
    move-object/from16 v48, v15

    .line 599
    .line 600
    goto/16 :goto_24

    .line 601
    .line 602
    :cond_1d
    move-object/from16 v37, v4

    .line 603
    .line 604
    instance-of v4, v5, Landroid/text/Spanned;

    .line 605
    .line 606
    if-nez v4, :cond_1e

    .line 607
    .line 608
    new-instance v4, LQ2/i;

    .line 609
    .line 610
    invoke-static {v5}, LQ2/l;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    invoke-direct {v4, v5}, LQ2/i;-><init>(Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    move-object v5, v4

    .line 618
    goto :goto_12

    .line 619
    :cond_1e
    check-cast v5, Landroid/text/Spanned;

    .line 620
    .line 621
    new-instance v4, Ljava/util/HashSet;

    .line 622
    .line 623
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 624
    .line 625
    .line 626
    move-object/from16 v38, v9

    .line 627
    .line 628
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 629
    .line 630
    .line 631
    move-result v9

    .line 632
    move/from16 v39, v10

    .line 633
    .line 634
    const-class v10, Landroid/text/style/BackgroundColorSpan;

    .line 635
    .line 636
    move/from16 v40, v14

    .line 637
    .line 638
    move/from16 v14, v21

    .line 639
    .line 640
    invoke-interface {v5, v14, v9, v10}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v9

    .line 644
    check-cast v9, [Landroid/text/style/BackgroundColorSpan;

    .line 645
    .line 646
    array-length v10, v9

    .line 647
    const/4 v14, 0x0

    .line 648
    :goto_13
    if-ge v14, v10, :cond_1f

    .line 649
    .line 650
    aget-object v41, v9, v14

    .line 651
    .line 652
    invoke-virtual/range {v41 .. v41}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    .line 653
    .line 654
    .line 655
    move-result v41

    .line 656
    move-object/from16 v42, v9

    .line 657
    .line 658
    invoke-static/range {v41 .. v41}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 659
    .line 660
    .line 661
    move-result-object v9

    .line 662
    invoke-virtual {v4, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    const/16 v26, 0x1

    .line 666
    .line 667
    add-int/lit8 v14, v14, 0x1

    .line 668
    .line 669
    move-object/from16 v9, v42

    .line 670
    .line 671
    goto :goto_13

    .line 672
    :cond_1f
    new-instance v9, Ljava/util/HashMap;

    .line 673
    .line 674
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 678
    .line 679
    .line 680
    move-result-object v4

    .line 681
    :goto_14
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 682
    .line 683
    .line 684
    move-result v10

    .line 685
    if-eqz v10, :cond_20

    .line 686
    .line 687
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v10

    .line 691
    check-cast v10, Ljava/lang/Integer;

    .line 692
    .line 693
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 694
    .line 695
    .line 696
    move-result v10

    .line 697
    const-string v14, "bg_"

    .line 698
    .line 699
    invoke-static {v10, v14}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v14

    .line 703
    move-object/from16 v41, v4

    .line 704
    .line 705
    new-instance v4, Ljava/lang/StringBuilder;

    .line 706
    .line 707
    move/from16 v42, v10

    .line 708
    .line 709
    const-string v10, "."

    .line 710
    .line 711
    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    const-string v10, ",."

    .line 718
    .line 719
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    const-string v10, " *"

    .line 726
    .line 727
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v4

    .line 734
    invoke-static/range {v42 .. v42}, LO4/h;->L(I)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v10

    .line 738
    sget v14, Ll4/y;->a:I

    .line 739
    .line 740
    sget-object v14, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 741
    .line 742
    new-instance v14, Ljava/lang/StringBuilder;

    .line 743
    .line 744
    invoke-direct {v14, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v10

    .line 757
    invoke-virtual {v9, v4, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-object/from16 v4, v41

    .line 761
    .line 762
    goto :goto_14

    .line 763
    :cond_20
    new-instance v4, Landroid/util/SparseArray;

    .line 764
    .line 765
    invoke-direct {v4}, Landroid/util/SparseArray;-><init>()V

    .line 766
    .line 767
    .line 768
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 769
    .line 770
    .line 771
    move-result v9

    .line 772
    const-class v10, Ljava/lang/Object;

    .line 773
    .line 774
    const/4 v14, 0x0

    .line 775
    invoke-interface {v5, v14, v9, v10}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v9

    .line 779
    array-length v10, v9

    .line 780
    const/4 v14, 0x0

    .line 781
    :goto_15
    if-ge v14, v10, :cond_46

    .line 782
    .line 783
    move-object/from16 v41, v8

    .line 784
    .line 785
    aget-object v8, v9, v14

    .line 786
    .line 787
    move-object/from16 v42, v9

    .line 788
    .line 789
    instance-of v9, v8, Landroid/text/style/StrikethroughSpan;

    .line 790
    .line 791
    const/16 v43, 0x0

    .line 792
    .line 793
    if-eqz v9, :cond_21

    .line 794
    .line 795
    const-string v44, "<span style=\'text-decoration:line-through;\'>"

    .line 796
    .line 797
    move-object/from16 v45, v44

    .line 798
    .line 799
    move/from16 v44, v9

    .line 800
    .line 801
    move-object/from16 v9, v45

    .line 802
    .line 803
    move/from16 v45, v10

    .line 804
    .line 805
    :goto_16
    move-object/from16 v46, v11

    .line 806
    .line 807
    :goto_17
    move/from16 v47, v14

    .line 808
    .line 809
    move-object/from16 v48, v15

    .line 810
    .line 811
    goto/16 :goto_1d

    .line 812
    .line 813
    :cond_21
    move/from16 v44, v9

    .line 814
    .line 815
    instance-of v9, v8, Landroid/text/style/ForegroundColorSpan;

    .line 816
    .line 817
    if-eqz v9, :cond_22

    .line 818
    .line 819
    move-object v9, v8

    .line 820
    check-cast v9, Landroid/text/style/ForegroundColorSpan;

    .line 821
    .line 822
    invoke-virtual {v9}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    .line 823
    .line 824
    .line 825
    move-result v9

    .line 826
    invoke-static {v9}, LO4/h;->L(I)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v9

    .line 830
    sget v45, Ll4/y;->a:I

    .line 831
    .line 832
    sget-object v45, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 833
    .line 834
    move/from16 v45, v10

    .line 835
    .line 836
    const-string v10, "<span style=\'color:"

    .line 837
    .line 838
    invoke-static {v10, v9, v3}, LA0/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v9

    .line 842
    goto :goto_16

    .line 843
    :cond_22
    move/from16 v45, v10

    .line 844
    .line 845
    instance-of v9, v8, Landroid/text/style/BackgroundColorSpan;

    .line 846
    .line 847
    if-eqz v9, :cond_23

    .line 848
    .line 849
    move-object v9, v8

    .line 850
    check-cast v9, Landroid/text/style/BackgroundColorSpan;

    .line 851
    .line 852
    invoke-virtual {v9}, Landroid/text/style/BackgroundColorSpan;->getBackgroundColor()I

    .line 853
    .line 854
    .line 855
    move-result v9

    .line 856
    sget v10, Ll4/y;->a:I

    .line 857
    .line 858
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 859
    .line 860
    const-string v10, "<span class=\'bg_"

    .line 861
    .line 862
    move-object/from16 v46, v11

    .line 863
    .line 864
    const-string v11, "\'>"

    .line 865
    .line 866
    invoke-static {v10, v9, v11}, LA0/a;->m(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v9

    .line 870
    goto :goto_17

    .line 871
    :cond_23
    move-object/from16 v46, v11

    .line 872
    .line 873
    instance-of v9, v8, Lc4/a;

    .line 874
    .line 875
    if-eqz v9, :cond_24

    .line 876
    .line 877
    const-string v9, "<span style=\'text-combine-upright:all;\'>"

    .line 878
    .line 879
    goto :goto_17

    .line 880
    :cond_24
    instance-of v9, v8, Landroid/text/style/AbsoluteSizeSpan;

    .line 881
    .line 882
    if-eqz v9, :cond_26

    .line 883
    .line 884
    move-object v9, v8

    .line 885
    check-cast v9, Landroid/text/style/AbsoluteSizeSpan;

    .line 886
    .line 887
    invoke-virtual {v9}, Landroid/text/style/AbsoluteSizeSpan;->getDip()Z

    .line 888
    .line 889
    .line 890
    move-result v10

    .line 891
    if-eqz v10, :cond_25

    .line 892
    .line 893
    invoke-virtual {v9}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    .line 894
    .line 895
    .line 896
    move-result v9

    .line 897
    int-to-float v9, v9

    .line 898
    goto :goto_18

    .line 899
    :cond_25
    invoke-virtual {v9}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    .line 900
    .line 901
    .line 902
    move-result v9

    .line 903
    int-to-float v9, v9

    .line 904
    div-float v9, v9, v28

    .line 905
    .line 906
    :goto_18
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 907
    .line 908
    .line 909
    move-result-object v9

    .line 910
    const/4 v10, 0x1

    .line 911
    new-array v11, v10, [Ljava/lang/Object;

    .line 912
    .line 913
    const/16 v21, 0x0

    .line 914
    .line 915
    aput-object v9, v11, v21

    .line 916
    .line 917
    sget v9, Ll4/y;->a:I

    .line 918
    .line 919
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 920
    .line 921
    const-string v10, "<span style=\'font-size:%.2fpx;\'>"

    .line 922
    .line 923
    invoke-static {v9, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v9

    .line 927
    goto :goto_17

    .line 928
    :cond_26
    instance-of v9, v8, Landroid/text/style/RelativeSizeSpan;

    .line 929
    .line 930
    if-eqz v9, :cond_27

    .line 931
    .line 932
    move-object v9, v8

    .line 933
    check-cast v9, Landroid/text/style/RelativeSizeSpan;

    .line 934
    .line 935
    invoke-virtual {v9}, Landroid/text/style/RelativeSizeSpan;->getSizeChange()F

    .line 936
    .line 937
    .line 938
    move-result v9

    .line 939
    mul-float v9, v9, v17

    .line 940
    .line 941
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 942
    .line 943
    .line 944
    move-result-object v9

    .line 945
    const/4 v10, 0x1

    .line 946
    new-array v11, v10, [Ljava/lang/Object;

    .line 947
    .line 948
    const/16 v21, 0x0

    .line 949
    .line 950
    aput-object v9, v11, v21

    .line 951
    .line 952
    sget v9, Ll4/y;->a:I

    .line 953
    .line 954
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 955
    .line 956
    const-string v10, "<span style=\'font-size:%.2f%%;\'>"

    .line 957
    .line 958
    invoke-static {v9, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v9

    .line 962
    goto/16 :goto_17

    .line 963
    .line 964
    :cond_27
    instance-of v9, v8, Landroid/text/style/TypefaceSpan;

    .line 965
    .line 966
    if-eqz v9, :cond_29

    .line 967
    .line 968
    move-object v9, v8

    .line 969
    check-cast v9, Landroid/text/style/TypefaceSpan;

    .line 970
    .line 971
    invoke-virtual {v9}, Landroid/text/style/TypefaceSpan;->getFamily()Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v9

    .line 975
    if-eqz v9, :cond_28

    .line 976
    .line 977
    sget v10, Ll4/y;->a:I

    .line 978
    .line 979
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 980
    .line 981
    const-string v10, "<span style=\'font-family:\""

    .line 982
    .line 983
    const-string v11, "\";\'>"

    .line 984
    .line 985
    invoke-static {v10, v9, v11}, LA0/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v9

    .line 989
    goto/16 :goto_17

    .line 990
    .line 991
    :cond_28
    :goto_19
    move/from16 v47, v14

    .line 992
    .line 993
    move-object/from16 v48, v15

    .line 994
    .line 995
    move-object/from16 v9, v43

    .line 996
    .line 997
    goto/16 :goto_1d

    .line 998
    .line 999
    :cond_29
    instance-of v9, v8, Landroid/text/style/StyleSpan;

    .line 1000
    .line 1001
    if-eqz v9, :cond_2d

    .line 1002
    .line 1003
    move-object v9, v8

    .line 1004
    check-cast v9, Landroid/text/style/StyleSpan;

    .line 1005
    .line 1006
    invoke-virtual {v9}, Landroid/text/style/StyleSpan;->getStyle()I

    .line 1007
    .line 1008
    .line 1009
    move-result v9

    .line 1010
    const/4 v10, 0x1

    .line 1011
    if-eq v9, v10, :cond_2c

    .line 1012
    .line 1013
    const/4 v10, 0x2

    .line 1014
    if-eq v9, v10, :cond_2b

    .line 1015
    .line 1016
    const/4 v10, 0x3

    .line 1017
    if-eq v9, v10, :cond_2a

    .line 1018
    .line 1019
    goto :goto_19

    .line 1020
    :cond_2a
    const-string v9, "<b><i>"

    .line 1021
    .line 1022
    goto/16 :goto_17

    .line 1023
    .line 1024
    :cond_2b
    const-string v9, "<i>"

    .line 1025
    .line 1026
    goto/16 :goto_17

    .line 1027
    .line 1028
    :cond_2c
    const-string v9, "<b>"

    .line 1029
    .line 1030
    goto/16 :goto_17

    .line 1031
    .line 1032
    :cond_2d
    instance-of v9, v8, Lc4/c;

    .line 1033
    .line 1034
    if-eqz v9, :cond_31

    .line 1035
    .line 1036
    move-object v9, v8

    .line 1037
    check-cast v9, Lc4/c;

    .line 1038
    .line 1039
    iget v9, v9, Lc4/c;->b:I

    .line 1040
    .line 1041
    const/4 v10, -0x1

    .line 1042
    if-eq v9, v10, :cond_30

    .line 1043
    .line 1044
    const/4 v10, 0x1

    .line 1045
    if-eq v9, v10, :cond_2f

    .line 1046
    .line 1047
    const/4 v10, 0x2

    .line 1048
    if-eq v9, v10, :cond_2e

    .line 1049
    .line 1050
    goto :goto_19

    .line 1051
    :cond_2e
    const-string v9, "<ruby style=\'ruby-position:under;\'>"

    .line 1052
    .line 1053
    goto/16 :goto_17

    .line 1054
    .line 1055
    :cond_2f
    const-string v9, "<ruby style=\'ruby-position:over;\'>"

    .line 1056
    .line 1057
    goto/16 :goto_17

    .line 1058
    .line 1059
    :cond_30
    const-string v9, "<ruby style=\'ruby-position:unset;\'>"

    .line 1060
    .line 1061
    goto/16 :goto_17

    .line 1062
    .line 1063
    :cond_31
    instance-of v9, v8, Landroid/text/style/UnderlineSpan;

    .line 1064
    .line 1065
    if-eqz v9, :cond_32

    .line 1066
    .line 1067
    const-string v9, "<u>"

    .line 1068
    .line 1069
    goto/16 :goto_17

    .line 1070
    .line 1071
    :cond_32
    instance-of v9, v8, Lc4/d;

    .line 1072
    .line 1073
    if-eqz v9, :cond_28

    .line 1074
    .line 1075
    move-object v9, v8

    .line 1076
    check-cast v9, Lc4/d;

    .line 1077
    .line 1078
    iget v10, v9, Lc4/d;->a:I

    .line 1079
    .line 1080
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1081
    .line 1082
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 1083
    .line 1084
    .line 1085
    move/from16 v47, v14

    .line 1086
    .line 1087
    iget v14, v9, Lc4/d;->b:I

    .line 1088
    .line 1089
    move-object/from16 v48, v15

    .line 1090
    .line 1091
    const/4 v15, 0x1

    .line 1092
    if-eq v14, v15, :cond_34

    .line 1093
    .line 1094
    const/4 v15, 0x2

    .line 1095
    if-eq v14, v15, :cond_33

    .line 1096
    .line 1097
    goto :goto_1a

    .line 1098
    :cond_33
    const-string v14, "open "

    .line 1099
    .line 1100
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1101
    .line 1102
    .line 1103
    goto :goto_1a

    .line 1104
    :cond_34
    const/4 v15, 0x2

    .line 1105
    const-string v14, "filled "

    .line 1106
    .line 1107
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1108
    .line 1109
    .line 1110
    :goto_1a
    if-eqz v10, :cond_38

    .line 1111
    .line 1112
    const/4 v14, 0x1

    .line 1113
    if-eq v10, v14, :cond_37

    .line 1114
    .line 1115
    if-eq v10, v15, :cond_36

    .line 1116
    .line 1117
    const/4 v14, 0x3

    .line 1118
    if-eq v10, v14, :cond_35

    .line 1119
    .line 1120
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1121
    .line 1122
    .line 1123
    goto :goto_1b

    .line 1124
    :cond_35
    const-string v10, "sesame"

    .line 1125
    .line 1126
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1127
    .line 1128
    .line 1129
    goto :goto_1b

    .line 1130
    :cond_36
    const-string v10, "dot"

    .line 1131
    .line 1132
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1133
    .line 1134
    .line 1135
    goto :goto_1b

    .line 1136
    :cond_37
    const-string v10, "circle"

    .line 1137
    .line 1138
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1139
    .line 1140
    .line 1141
    goto :goto_1b

    .line 1142
    :cond_38
    const-string v10, "none"

    .line 1143
    .line 1144
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1145
    .line 1146
    .line 1147
    :goto_1b
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v10

    .line 1151
    iget v9, v9, Lc4/d;->c:I

    .line 1152
    .line 1153
    const/4 v15, 0x2

    .line 1154
    if-eq v9, v15, :cond_39

    .line 1155
    .line 1156
    const-string v9, "over right"

    .line 1157
    .line 1158
    goto :goto_1c

    .line 1159
    :cond_39
    const-string v9, "under left"

    .line 1160
    .line 1161
    :goto_1c
    new-array v11, v15, [Ljava/lang/Object;

    .line 1162
    .line 1163
    const/16 v21, 0x0

    .line 1164
    .line 1165
    aput-object v10, v11, v21

    .line 1166
    .line 1167
    const/16 v26, 0x1

    .line 1168
    .line 1169
    aput-object v9, v11, v26

    .line 1170
    .line 1171
    sget v9, Ll4/y;->a:I

    .line 1172
    .line 1173
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1174
    .line 1175
    const-string v10, "<span style=\'-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;\'>"

    .line 1176
    .line 1177
    invoke-static {v9, v10, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v9

    .line 1181
    :goto_1d
    if-nez v44, :cond_3b

    .line 1182
    .line 1183
    instance-of v10, v8, Landroid/text/style/ForegroundColorSpan;

    .line 1184
    .line 1185
    if-nez v10, :cond_3b

    .line 1186
    .line 1187
    instance-of v10, v8, Landroid/text/style/BackgroundColorSpan;

    .line 1188
    .line 1189
    if-nez v10, :cond_3b

    .line 1190
    .line 1191
    instance-of v10, v8, Lc4/a;

    .line 1192
    .line 1193
    if-nez v10, :cond_3b

    .line 1194
    .line 1195
    instance-of v10, v8, Landroid/text/style/AbsoluteSizeSpan;

    .line 1196
    .line 1197
    if-nez v10, :cond_3b

    .line 1198
    .line 1199
    instance-of v10, v8, Landroid/text/style/RelativeSizeSpan;

    .line 1200
    .line 1201
    if-nez v10, :cond_3b

    .line 1202
    .line 1203
    instance-of v10, v8, Lc4/d;

    .line 1204
    .line 1205
    if-eqz v10, :cond_3a

    .line 1206
    .line 1207
    goto :goto_1e

    .line 1208
    :cond_3a
    instance-of v10, v8, Landroid/text/style/TypefaceSpan;

    .line 1209
    .line 1210
    if-eqz v10, :cond_3d

    .line 1211
    .line 1212
    move-object v10, v8

    .line 1213
    check-cast v10, Landroid/text/style/TypefaceSpan;

    .line 1214
    .line 1215
    invoke-virtual {v10}, Landroid/text/style/TypefaceSpan;->getFamily()Ljava/lang/String;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v10

    .line 1219
    if-eqz v10, :cond_3c

    .line 1220
    .line 1221
    :cond_3b
    :goto_1e
    move-object v10, v1

    .line 1222
    goto :goto_20

    .line 1223
    :cond_3c
    :goto_1f
    move-object/from16 v10, v43

    .line 1224
    .line 1225
    goto :goto_20

    .line 1226
    :cond_3d
    instance-of v10, v8, Landroid/text/style/StyleSpan;

    .line 1227
    .line 1228
    if-eqz v10, :cond_41

    .line 1229
    .line 1230
    move-object v10, v8

    .line 1231
    check-cast v10, Landroid/text/style/StyleSpan;

    .line 1232
    .line 1233
    invoke-virtual {v10}, Landroid/text/style/StyleSpan;->getStyle()I

    .line 1234
    .line 1235
    .line 1236
    move-result v10

    .line 1237
    const/4 v15, 0x1

    .line 1238
    if-eq v10, v15, :cond_40

    .line 1239
    .line 1240
    const/4 v15, 0x2

    .line 1241
    if-eq v10, v15, :cond_3f

    .line 1242
    .line 1243
    const/4 v14, 0x3

    .line 1244
    if-eq v10, v14, :cond_3e

    .line 1245
    .line 1246
    goto :goto_1f

    .line 1247
    :cond_3e
    const-string v43, "</i></b>"

    .line 1248
    .line 1249
    goto :goto_1f

    .line 1250
    :cond_3f
    const-string v43, "</i>"

    .line 1251
    .line 1252
    goto :goto_1f

    .line 1253
    :cond_40
    const-string v43, "</b>"

    .line 1254
    .line 1255
    goto :goto_1f

    .line 1256
    :cond_41
    instance-of v10, v8, Lc4/c;

    .line 1257
    .line 1258
    if-eqz v10, :cond_42

    .line 1259
    .line 1260
    move-object v10, v8

    .line 1261
    check-cast v10, Lc4/c;

    .line 1262
    .line 1263
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1264
    .line 1265
    const-string v14, "<rt>"

    .line 1266
    .line 1267
    invoke-direct {v11, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1268
    .line 1269
    .line 1270
    iget-object v10, v10, Lc4/c;->a:Ljava/lang/String;

    .line 1271
    .line 1272
    invoke-static {v10}, LQ2/l;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v10

    .line 1276
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1277
    .line 1278
    .line 1279
    const-string v10, "</rt></ruby>"

    .line 1280
    .line 1281
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v43

    .line 1288
    goto :goto_1f

    .line 1289
    :cond_42
    instance-of v10, v8, Landroid/text/style/UnderlineSpan;

    .line 1290
    .line 1291
    if-eqz v10, :cond_3c

    .line 1292
    .line 1293
    const-string v43, "</u>"

    .line 1294
    .line 1295
    goto :goto_1f

    .line 1296
    :goto_20
    invoke-interface {v5, v8}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 1297
    .line 1298
    .line 1299
    move-result v11

    .line 1300
    invoke-interface {v5, v8}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 1301
    .line 1302
    .line 1303
    move-result v8

    .line 1304
    if-eqz v9, :cond_45

    .line 1305
    .line 1306
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1307
    .line 1308
    .line 1309
    new-instance v14, LQ2/j;

    .line 1310
    .line 1311
    invoke-direct {v14, v9, v11, v8, v10}, LQ2/j;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v4, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v9

    .line 1318
    check-cast v9, LQ2/k;

    .line 1319
    .line 1320
    if-nez v9, :cond_43

    .line 1321
    .line 1322
    new-instance v9, LQ2/k;

    .line 1323
    .line 1324
    invoke-direct {v9}, LQ2/k;-><init>()V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v4, v11, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1328
    .line 1329
    .line 1330
    :cond_43
    iget-object v9, v9, LQ2/k;->a:Ljava/util/ArrayList;

    .line 1331
    .line 1332
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v4, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v9

    .line 1339
    check-cast v9, LQ2/k;

    .line 1340
    .line 1341
    if-nez v9, :cond_44

    .line 1342
    .line 1343
    new-instance v9, LQ2/k;

    .line 1344
    .line 1345
    invoke-direct {v9}, LQ2/k;-><init>()V

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual {v4, v8, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1349
    .line 1350
    .line 1351
    :cond_44
    iget-object v8, v9, LQ2/k;->b:Ljava/util/ArrayList;

    .line 1352
    .line 1353
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1354
    .line 1355
    .line 1356
    :cond_45
    const/16 v26, 0x1

    .line 1357
    .line 1358
    add-int/lit8 v14, v47, 0x1

    .line 1359
    .line 1360
    move-object/from16 v8, v41

    .line 1361
    .line 1362
    move-object/from16 v9, v42

    .line 1363
    .line 1364
    move/from16 v10, v45

    .line 1365
    .line 1366
    move-object/from16 v11, v46

    .line 1367
    .line 1368
    move-object/from16 v15, v48

    .line 1369
    .line 1370
    goto/16 :goto_15

    .line 1371
    .line 1372
    :cond_46
    move-object/from16 v41, v8

    .line 1373
    .line 1374
    move-object/from16 v46, v11

    .line 1375
    .line 1376
    move-object/from16 v48, v15

    .line 1377
    .line 1378
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1379
    .line 1380
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 1381
    .line 1382
    .line 1383
    move-result v9

    .line 1384
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1385
    .line 1386
    .line 1387
    const/4 v9, 0x0

    .line 1388
    const/4 v10, 0x0

    .line 1389
    :goto_21
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    .line 1390
    .line 1391
    .line 1392
    move-result v11

    .line 1393
    if-ge v9, v11, :cond_49

    .line 1394
    .line 1395
    invoke-virtual {v4, v9}, Landroid/util/SparseArray;->keyAt(I)I

    .line 1396
    .line 1397
    .line 1398
    move-result v11

    .line 1399
    invoke-interface {v5, v10, v11}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v10

    .line 1403
    invoke-static {v10}, LQ2/l;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v10

    .line 1407
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v4, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v10

    .line 1414
    check-cast v10, LQ2/k;

    .line 1415
    .line 1416
    iget-object v14, v10, LQ2/k;->b:Ljava/util/ArrayList;

    .line 1417
    .line 1418
    sget-object v15, LQ2/j;->f:LE6/a;

    .line 1419
    .line 1420
    invoke-static {v14, v15}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1421
    .line 1422
    .line 1423
    iget-object v14, v10, LQ2/k;->b:Ljava/util/ArrayList;

    .line 1424
    .line 1425
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 1426
    .line 1427
    .line 1428
    move-result v15

    .line 1429
    move-object/from16 v17, v4

    .line 1430
    .line 1431
    const/4 v4, 0x0

    .line 1432
    :goto_22
    if-ge v4, v15, :cond_47

    .line 1433
    .line 1434
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v28

    .line 1438
    const/16 v26, 0x1

    .line 1439
    .line 1440
    add-int/lit8 v4, v4, 0x1

    .line 1441
    .line 1442
    move/from16 v42, v4

    .line 1443
    .line 1444
    move-object/from16 v4, v28

    .line 1445
    .line 1446
    check-cast v4, LQ2/j;

    .line 1447
    .line 1448
    iget-object v4, v4, LQ2/j;->d:Ljava/lang/String;

    .line 1449
    .line 1450
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1451
    .line 1452
    .line 1453
    move/from16 v4, v42

    .line 1454
    .line 1455
    goto :goto_22

    .line 1456
    :cond_47
    iget-object v4, v10, LQ2/k;->a:Ljava/util/ArrayList;

    .line 1457
    .line 1458
    sget-object v10, LQ2/j;->e:LE6/a;

    .line 1459
    .line 1460
    invoke-static {v4, v10}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1461
    .line 1462
    .line 1463
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1464
    .line 1465
    .line 1466
    move-result v10

    .line 1467
    const/4 v14, 0x0

    .line 1468
    :goto_23
    if-ge v14, v10, :cond_48

    .line 1469
    .line 1470
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v15

    .line 1474
    const/16 v26, 0x1

    .line 1475
    .line 1476
    add-int/lit8 v14, v14, 0x1

    .line 1477
    .line 1478
    check-cast v15, LQ2/j;

    .line 1479
    .line 1480
    iget-object v15, v15, LQ2/j;->c:Ljava/lang/String;

    .line 1481
    .line 1482
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1483
    .line 1484
    .line 1485
    goto :goto_23

    .line 1486
    :cond_48
    const/16 v26, 0x1

    .line 1487
    .line 1488
    add-int/lit8 v9, v9, 0x1

    .line 1489
    .line 1490
    move v10, v11

    .line 1491
    move-object/from16 v4, v17

    .line 1492
    .line 1493
    goto :goto_21

    .line 1494
    :cond_49
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 1495
    .line 1496
    .line 1497
    move-result v4

    .line 1498
    invoke-interface {v5, v10, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v4

    .line 1502
    invoke-static {v4}, LQ2/l;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v4

    .line 1506
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1507
    .line 1508
    .line 1509
    new-instance v5, LQ2/i;

    .line 1510
    .line 1511
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v4

    .line 1515
    invoke-direct {v5, v4}, LQ2/i;-><init>(Ljava/lang/String;)V

    .line 1516
    .line 1517
    .line 1518
    :goto_24
    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v4

    .line 1522
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v4

    .line 1526
    :goto_25
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1527
    .line 1528
    .line 1529
    move-result v8

    .line 1530
    if-eqz v8, :cond_4c

    .line 1531
    .line 1532
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v8

    .line 1536
    check-cast v8, Ljava/lang/String;

    .line 1537
    .line 1538
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v9

    .line 1542
    check-cast v9, Ljava/lang/String;

    .line 1543
    .line 1544
    invoke-virtual {v7, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v9

    .line 1548
    check-cast v9, Ljava/lang/String;

    .line 1549
    .line 1550
    if-eqz v9, :cond_4b

    .line 1551
    .line 1552
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v8

    .line 1556
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1557
    .line 1558
    .line 1559
    move-result v8

    .line 1560
    if-eqz v8, :cond_4a

    .line 1561
    .line 1562
    goto :goto_26

    .line 1563
    :cond_4a
    const/4 v8, 0x0

    .line 1564
    goto :goto_27

    .line 1565
    :cond_4b
    :goto_26
    const/4 v8, 0x1

    .line 1566
    :goto_27
    invoke-static {v8}, Ll4/a;->m(Z)V

    .line 1567
    .line 1568
    .line 1569
    goto :goto_25

    .line 1570
    :cond_4c
    invoke-static/range {v39 .. v39}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v4

    .line 1574
    invoke-static/range {v40 .. v40}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v8

    .line 1578
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v9

    .line 1582
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v10

    .line 1586
    iget v11, v12, LY3/b;->q:F

    .line 1587
    .line 1588
    cmpl-float v14, v11, v23

    .line 1589
    .line 1590
    if-eqz v14, :cond_4f

    .line 1591
    .line 1592
    const/4 v15, 0x2

    .line 1593
    const/4 v14, 0x1

    .line 1594
    if-eq v2, v15, :cond_4e

    .line 1595
    .line 1596
    if-ne v2, v14, :cond_4d

    .line 1597
    .line 1598
    goto :goto_28

    .line 1599
    :cond_4d
    const-string v2, "skewX"

    .line 1600
    .line 1601
    goto :goto_29

    .line 1602
    :cond_4e
    :goto_28
    const-string v2, "skewY"

    .line 1603
    .line 1604
    :goto_29
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v11

    .line 1608
    move/from16 v26, v14

    .line 1609
    .line 1610
    new-array v14, v15, [Ljava/lang/Object;

    .line 1611
    .line 1612
    const/16 v21, 0x0

    .line 1613
    .line 1614
    aput-object v2, v14, v21

    .line 1615
    .line 1616
    aput-object v11, v14, v26

    .line 1617
    .line 1618
    sget v2, Ll4/y;->a:I

    .line 1619
    .line 1620
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1621
    .line 1622
    const-string v11, "%s(%.2fdeg)"

    .line 1623
    .line 1624
    invoke-static {v2, v11, v14}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v2

    .line 1628
    goto :goto_2a

    .line 1629
    :cond_4f
    move-object/from16 v2, v37

    .line 1630
    .line 1631
    :goto_2a
    const/16 v11, 0xe

    .line 1632
    .line 1633
    new-array v11, v11, [Ljava/lang/Object;

    .line 1634
    .line 1635
    const/16 v21, 0x0

    .line 1636
    .line 1637
    aput-object v4, v11, v21

    .line 1638
    .line 1639
    const/16 v26, 0x1

    .line 1640
    .line 1641
    aput-object v31, v11, v26

    .line 1642
    .line 1643
    const/16 v16, 0x2

    .line 1644
    .line 1645
    aput-object v8, v11, v16

    .line 1646
    .line 1647
    const/16 v25, 0x3

    .line 1648
    .line 1649
    aput-object v30, v11, v25

    .line 1650
    .line 1651
    aput-object v35, v11, v19

    .line 1652
    .line 1653
    const/4 v4, 0x5

    .line 1654
    aput-object v32, v11, v4

    .line 1655
    .line 1656
    const/4 v4, 0x6

    .line 1657
    aput-object v27, v11, v4

    .line 1658
    .line 1659
    const/4 v4, 0x7

    .line 1660
    aput-object v36, v11, v4

    .line 1661
    .line 1662
    const/16 v4, 0x8

    .line 1663
    .line 1664
    aput-object v29, v11, v4

    .line 1665
    .line 1666
    const/16 v4, 0x9

    .line 1667
    .line 1668
    aput-object v33, v11, v4

    .line 1669
    .line 1670
    const/16 v4, 0xa

    .line 1671
    .line 1672
    aput-object v34, v11, v4

    .line 1673
    .line 1674
    const/16 v4, 0xb

    .line 1675
    .line 1676
    aput-object v9, v11, v4

    .line 1677
    .line 1678
    const/16 v4, 0xc

    .line 1679
    .line 1680
    aput-object v10, v11, v4

    .line 1681
    .line 1682
    const/16 v4, 0xd

    .line 1683
    .line 1684
    aput-object v2, v11, v4

    .line 1685
    .line 1686
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1687
    .line 1688
    const-string v4, "<div style=\'position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;\'>"

    .line 1689
    .line 1690
    invoke-static {v2, v4, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v2

    .line 1694
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1695
    .line 1696
    .line 1697
    const-string v2, "<span class=\'default_bg\'>"

    .line 1698
    .line 1699
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1700
    .line 1701
    .line 1702
    iget-object v2, v5, LQ2/i;->a:Ljava/lang/String;

    .line 1703
    .line 1704
    iget-object v4, v12, LY3/b;->c:Landroid/text/Layout$Alignment;

    .line 1705
    .line 1706
    if-eqz v4, :cond_52

    .line 1707
    .line 1708
    sget-object v5, LQ2/X;->a:[I

    .line 1709
    .line 1710
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 1711
    .line 1712
    .line 1713
    move-result v4

    .line 1714
    aget v4, v5, v4

    .line 1715
    .line 1716
    const/4 v10, 0x1

    .line 1717
    if-eq v4, v10, :cond_51

    .line 1718
    .line 1719
    const/4 v15, 0x2

    .line 1720
    if-eq v4, v15, :cond_50

    .line 1721
    .line 1722
    move-object/from16 v9, v24

    .line 1723
    .line 1724
    goto :goto_2b

    .line 1725
    :cond_50
    move-object/from16 v9, v48

    .line 1726
    .line 1727
    goto :goto_2b

    .line 1728
    :cond_51
    const/4 v15, 0x2

    .line 1729
    move-object/from16 v9, v38

    .line 1730
    .line 1731
    :goto_2b
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1732
    .line 1733
    const-string v5, "<span style=\'display:inline-block; text-align:"

    .line 1734
    .line 1735
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1736
    .line 1737
    .line 1738
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1739
    .line 1740
    .line 1741
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1742
    .line 1743
    .line 1744
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v3

    .line 1748
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1749
    .line 1750
    .line 1751
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1752
    .line 1753
    .line 1754
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1755
    .line 1756
    .line 1757
    goto :goto_2c

    .line 1758
    :cond_52
    const/4 v15, 0x2

    .line 1759
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1760
    .line 1761
    .line 1762
    :goto_2c
    const-string v1, "</span></div>"

    .line 1763
    .line 1764
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1765
    .line 1766
    .line 1767
    const/16 v26, 0x1

    .line 1768
    .line 1769
    add-int/lit8 v10, v39, 0x1

    .line 1770
    .line 1771
    move v3, v15

    .line 1772
    move/from16 v1, v19

    .line 1773
    .line 1774
    move/from16 v9, v20

    .line 1775
    .line 1776
    move/from16 v2, v25

    .line 1777
    .line 1778
    move-object/from16 v8, v41

    .line 1779
    .line 1780
    move-object/from16 v11, v46

    .line 1781
    .line 1782
    const/4 v4, 0x0

    .line 1783
    const/4 v5, 0x1

    .line 1784
    goto/16 :goto_1

    .line 1785
    .line 1786
    :cond_53
    const-string v1, "</div></body></html>"

    .line 1787
    .line 1788
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1789
    .line 1790
    .line 1791
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1792
    .line 1793
    const-string v2, "<html><head><style>"

    .line 1794
    .line 1795
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1796
    .line 1797
    .line 1798
    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v2

    .line 1802
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v2

    .line 1806
    :goto_2d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1807
    .line 1808
    .line 1809
    move-result v3

    .line 1810
    if-eqz v3, :cond_54

    .line 1811
    .line 1812
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v3

    .line 1816
    check-cast v3, Ljava/lang/String;

    .line 1817
    .line 1818
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1819
    .line 1820
    .line 1821
    const-string v4, "{"

    .line 1822
    .line 1823
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1824
    .line 1825
    .line 1826
    invoke-virtual {v7, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v3

    .line 1830
    check-cast v3, Ljava/lang/String;

    .line 1831
    .line 1832
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1833
    .line 1834
    .line 1835
    const-string v3, "}"

    .line 1836
    .line 1837
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1838
    .line 1839
    .line 1840
    goto :goto_2d

    .line 1841
    :cond_54
    const-string v2, "</style></head>"

    .line 1842
    .line 1843
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1844
    .line 1845
    .line 1846
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v1

    .line 1850
    const/4 v14, 0x0

    .line 1851
    invoke-virtual {v6, v14, v1}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1852
    .line 1853
    .line 1854
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v1

    .line 1858
    sget-object v2, LO5/e;->c:Ljava/nio/charset/Charset;

    .line 1859
    .line 1860
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1861
    .line 1862
    .line 1863
    move-result-object v1

    .line 1864
    const/4 v10, 0x1

    .line 1865
    invoke-static {v1, v10}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v1

    .line 1869
    const-string v2, "text/html"

    .line 1870
    .line 1871
    const-string v3, "base64"

    .line 1872
    .line 1873
    iget-object v4, v0, LQ2/Y;->b:LQ2/W;

    .line 1874
    .line 1875
    invoke-virtual {v4, v1, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1876
    .line 1877
    .line 1878
    return-void
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move p2, p1

    .line 5
    move-object p1, p0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iget-object p2, p1, LQ2/Y;->c:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, LQ2/Y;->c()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
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
