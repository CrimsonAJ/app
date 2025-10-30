.class public Lj3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LF5/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj3/k;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, LF5/e;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p1, v0}, LF5/e;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lj3/k;->b:LF5/e;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
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
.end method


# virtual methods
.method public a(Lj3/A;Landroid/os/Looper;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    new-instance v0, LY3/l;

    .line 2
    .line 3
    sget-object v1, LY3/j;->L:LF5/e;

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, v1}, LY3/l;-><init>(Lj3/A;Landroid/os/Looper;LY3/j;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
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
.end method

.method public final b(Landroid/os/Handler;Lj3/A;Lj3/A;Lj3/A;Lj3/A;)[Lj3/d;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lm4/i;

    .line 7
    .line 8
    iget-object v4, p0, Lj3/k;->b:LF5/e;

    .line 9
    .line 10
    iget-object v3, p0, Lj3/k;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {v1, v3, v4, p1, p2}, Lm4/i;-><init>(Landroid/content/Context;LC3/l;Landroid/os/Handler;Lj3/A;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    new-instance p2, Lb5/G1;

    .line 19
    .line 20
    const/16 v1, 0xe

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {p2, v1, v2}, Lb5/G1;-><init>(IZ)V

    .line 24
    .line 25
    .line 26
    sget-object v1, Ll3/g;->c:Ll3/g;

    .line 27
    .line 28
    iput-object v1, p2, Lb5/G1;->b:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v2, Ll3/E;->a:Ll3/E;

    .line 31
    .line 32
    iput-object v2, p2, Lb5/G1;->d:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance v2, Landroid/content/IntentFilter;

    .line 35
    .line 36
    const-string v5, "android.media.action.HDMI_AUDIO_PLUG"

    .line 37
    .line 38
    invoke-direct {v2, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    invoke-static {v3, v5, v2}, Ll4/y;->M(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    sget v5, Ll4/y;->a:I

    .line 47
    .line 48
    const/16 v6, 0x11

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    if-lt v5, v6, :cond_1

    .line 52
    .line 53
    sget-object v6, Ll4/y;->c:Ljava/lang/String;

    .line 54
    .line 55
    const-string v7, "Amazon"

    .line 56
    .line 57
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-nez v7, :cond_0

    .line 62
    .line 63
    const-string v7, "Xiaomi"

    .line 64
    .line 65
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_1

    .line 70
    .line 71
    :cond_0
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    const-string v7, "external_surround_sound_enabled"

    .line 76
    .line 77
    invoke-static {v6, v7, v8}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    const/4 v7, 0x1

    .line 82
    if-ne v6, v7, :cond_1

    .line 83
    .line 84
    sget-object v1, Ll3/g;->d:Ll3/g;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    const/16 v6, 0x1d

    .line 88
    .line 89
    const/16 v7, 0x8

    .line 90
    .line 91
    if-lt v5, v6, :cond_3

    .line 92
    .line 93
    invoke-static {v3}, Ll4/y;->G(Landroid/content/Context;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-nez v6, :cond_2

    .line 98
    .line 99
    const/16 v6, 0x17

    .line 100
    .line 101
    if-lt v5, v6, :cond_3

    .line 102
    .line 103
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    const-string v6, "android.hardware.type.automotive"

    .line 108
    .line 109
    invoke-virtual {v5, v6}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_3

    .line 114
    .line 115
    :cond_2
    new-instance v1, Ll3/g;

    .line 116
    .line 117
    invoke-static {}, Ll3/f;->a()[I

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-direct {v1, v2, v7}, Ll3/g;-><init>([II)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    if-eqz v2, :cond_5

    .line 126
    .line 127
    const-string v5, "android.media.extra.AUDIO_PLUG_STATE"

    .line 128
    .line 129
    invoke-virtual {v2, v5, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-nez v5, :cond_4

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_4
    new-instance v1, Ll3/g;

    .line 137
    .line 138
    const-string v5, "android.media.extra.ENCODINGS"

    .line 139
    .line 140
    invoke-virtual {v2, v5}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    const-string v6, "android.media.extra.MAX_CHANNEL_COUNT"

    .line 145
    .line 146
    invoke-virtual {v2, v6, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    invoke-direct {v1, v5, v2}, Ll3/g;-><init>([II)V

    .line 151
    .line 152
    .line 153
    :cond_5
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iput-object v1, p2, Lb5/G1;->b:Ljava/lang/Object;

    .line 157
    .line 158
    iget-object v1, p2, Lb5/G1;->c:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, Lb5/G1;

    .line 161
    .line 162
    if-nez v1, :cond_6

    .line 163
    .line 164
    new-instance v1, Lb5/G1;

    .line 165
    .line 166
    new-array v2, v8, [Ll3/j;

    .line 167
    .line 168
    invoke-direct {v1, v2}, Lb5/G1;-><init>([Ll3/j;)V

    .line 169
    .line 170
    .line 171
    iput-object v1, p2, Lb5/G1;->c:Ljava/lang/Object;

    .line 172
    .line 173
    :cond_6
    new-instance v7, Ll3/D;

    .line 174
    .line 175
    invoke-direct {v7, p2}, Ll3/D;-><init>(Lb5/G1;)V

    .line 176
    .line 177
    .line 178
    new-instance v2, Ll3/H;

    .line 179
    .line 180
    move-object v5, p1

    .line 181
    move-object v6, p3

    .line 182
    invoke-direct/range {v2 .. v7}, Ll3/H;-><init>(Landroid/content/Context;LC3/l;Landroid/os/Handler;Lj3/A;Ll3/D;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    invoke-virtual {v5}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p0, p4, p1, v0}, Lj3/k;->a(Lj3/A;Landroid/os/Looper;Ljava/util/ArrayList;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    new-instance p2, LD3/f;

    .line 200
    .line 201
    invoke-direct {p2, p5, p1}, LD3/f;-><init>(Lj3/A;Landroid/os/Looper;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    new-instance p1, Ln4/b;

    .line 208
    .line 209
    invoke-direct {p1}, Ln4/b;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    new-array p1, v8, [Lj3/d;

    .line 216
    .line 217
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    check-cast p1, [Lj3/d;

    .line 222
    .line 223
    return-object p1
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
