.class public final Lco/notix/lp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/gr;


# instance fields
.field public final synthetic a:Lco/notix/gr;


# direct methods
.method public constructor <init>(Lco/notix/k9;)V
    .locals 0

    iput-object p1, p0, Lco/notix/lp;->a:Lco/notix/gr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lco/notix/sp;

    .line 2
    .line 3
    const-string v0, "from"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lco/notix/lp;->a:Lco/notix/gr;

    .line 14
    .line 15
    iget-object v2, p1, Lco/notix/sp;->a:Lco/notix/l9;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1, v2}, Lco/notix/td;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lorg/json/JSONObject;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v3

    .line 28
    :goto_0
    const-string v2, "domains"

    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    new-instance v1, Lorg/json/JSONObject;

    .line 34
    .line 35
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v2, p1, Lco/notix/sp;->b:Lco/notix/rp;

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    iget-object v2, v2, Lco/notix/rp;->a:Lco/notix/ql;

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    iget-object v2, v2, Lco/notix/ql;->a:Ljava/lang/String;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object v2, v3

    .line 50
    :goto_1
    const-string v4, "level"

    .line 51
    .line 52
    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    iget-object v2, p1, Lco/notix/sp;->b:Lco/notix/rp;

    .line 56
    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    iget-object v2, v2, Lco/notix/rp;->b:Ljava/lang/Long;

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move-object v2, v3

    .line 63
    :goto_2
    const-string v4, "storage_max_size"

    .line 64
    .line 65
    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    new-instance v2, Lorg/json/JSONObject;

    .line 69
    .line 70
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 71
    .line 72
    .line 73
    iget-object v4, p1, Lco/notix/sp;->b:Lco/notix/rp;

    .line 74
    .line 75
    if-eqz v4, :cond_3

    .line 76
    .line 77
    iget-object v4, v4, Lco/notix/rp;->c:Lco/notix/qp;

    .line 78
    .line 79
    if-eqz v4, :cond_3

    .line 80
    .line 81
    iget-object v4, v4, Lco/notix/qp;->a:Ljava/lang/Long;

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    move-object v4, v3

    .line 85
    :goto_3
    const-string v5, "vh"

    .line 86
    .line 87
    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    iget-object v4, p1, Lco/notix/sp;->b:Lco/notix/rp;

    .line 91
    .line 92
    if-eqz v4, :cond_4

    .line 93
    .line 94
    iget-object v4, v4, Lco/notix/rp;->c:Lco/notix/qp;

    .line 95
    .line 96
    if-eqz v4, :cond_4

    .line 97
    .line 98
    iget-object v4, v4, Lco/notix/qp;->b:Ljava/lang/Long;

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_4
    move-object v4, v3

    .line 102
    :goto_4
    const-string v5, "ih"

    .line 103
    .line 104
    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 105
    .line 106
    .line 107
    iget-object v4, p1, Lco/notix/sp;->b:Lco/notix/rp;

    .line 108
    .line 109
    if-eqz v4, :cond_5

    .line 110
    .line 111
    iget-object v4, v4, Lco/notix/rp;->c:Lco/notix/qp;

    .line 112
    .line 113
    if-eqz v4, :cond_5

    .line 114
    .line 115
    iget-object v4, v4, Lco/notix/qp;->c:Ljava/lang/Long;

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_5
    move-object v4, v3

    .line 119
    :goto_5
    const-string v5, "eh"

    .line 120
    .line 121
    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    iget-object v4, p1, Lco/notix/sp;->b:Lco/notix/rp;

    .line 125
    .line 126
    if-eqz v4, :cond_6

    .line 127
    .line 128
    iget-object v4, v4, Lco/notix/rp;->c:Lco/notix/qp;

    .line 129
    .line 130
    if-eqz v4, :cond_6

    .line 131
    .line 132
    iget-object v4, v4, Lco/notix/qp;->d:Ljava/lang/Long;

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_6
    move-object v4, v3

    .line 136
    :goto_6
    const-string v5, "delay"

    .line 137
    .line 138
    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    const-string v4, "rate_limits"

    .line 142
    .line 143
    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 144
    .line 145
    .line 146
    const-string v2, "remote_logs"

    .line 147
    .line 148
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    new-instance v1, Lorg/json/JSONObject;

    .line 152
    .line 153
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 154
    .line 155
    .line 156
    new-instance v2, Lorg/json/JSONObject;

    .line 157
    .line 158
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 159
    .line 160
    .line 161
    iget-object v4, p1, Lco/notix/sp;->c:Lco/notix/pp;

    .line 162
    .line 163
    if-eqz v4, :cond_7

    .line 164
    .line 165
    iget-object v4, v4, Lco/notix/pp;->a:Lco/notix/np;

    .line 166
    .line 167
    if-eqz v4, :cond_7

    .line 168
    .line 169
    iget-object v4, v4, Lco/notix/np;->a:Ljava/lang/Boolean;

    .line 170
    .line 171
    goto :goto_7

    .line 172
    :cond_7
    move-object v4, v3

    .line 173
    :goto_7
    const-string v5, "force_ad"

    .line 174
    .line 175
    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 176
    .line 177
    .line 178
    iget-object v4, p1, Lco/notix/sp;->c:Lco/notix/pp;

    .line 179
    .line 180
    if-eqz v4, :cond_8

    .line 181
    .line 182
    iget-object v4, v4, Lco/notix/pp;->a:Lco/notix/np;

    .line 183
    .line 184
    if-eqz v4, :cond_8

    .line 185
    .line 186
    iget-object v4, v4, Lco/notix/np;->b:Ljava/lang/Integer;

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_8
    move-object v4, v3

    .line 190
    :goto_8
    const-string v5, "ad_freq"

    .line 191
    .line 192
    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 193
    .line 194
    .line 195
    iget-object v4, p1, Lco/notix/sp;->c:Lco/notix/pp;

    .line 196
    .line 197
    if-eqz v4, :cond_9

    .line 198
    .line 199
    iget-object v4, v4, Lco/notix/pp;->a:Lco/notix/np;

    .line 200
    .line 201
    if-eqz v4, :cond_9

    .line 202
    .line 203
    iget-object v4, v4, Lco/notix/np;->c:Ljava/lang/Long;

    .line 204
    .line 205
    goto :goto_9

    .line 206
    :cond_9
    move-object v4, v3

    .line 207
    :goto_9
    const-string v5, "ad_initial_delay"

    .line 208
    .line 209
    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 210
    .line 211
    .line 212
    iget-object v4, p1, Lco/notix/sp;->c:Lco/notix/pp;

    .line 213
    .line 214
    if-eqz v4, :cond_a

    .line 215
    .line 216
    iget-object v4, v4, Lco/notix/pp;->a:Lco/notix/np;

    .line 217
    .line 218
    if-eqz v4, :cond_a

    .line 219
    .line 220
    iget-object v4, v4, Lco/notix/np;->d:Ljava/lang/Long;

    .line 221
    .line 222
    goto :goto_a

    .line 223
    :cond_a
    move-object v4, v3

    .line 224
    :goto_a
    const-string v5, "ad_minimal_delay"

    .line 225
    .line 226
    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 227
    .line 228
    .line 229
    const-string v4, "pull"

    .line 230
    .line 231
    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 232
    .line 233
    .line 234
    new-instance v2, Lorg/json/JSONObject;

    .line 235
    .line 236
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 237
    .line 238
    .line 239
    iget-object v4, p1, Lco/notix/sp;->c:Lco/notix/pp;

    .line 240
    .line 241
    if-eqz v4, :cond_b

    .line 242
    .line 243
    iget-object v4, v4, Lco/notix/pp;->b:Lco/notix/op;

    .line 244
    .line 245
    if-eqz v4, :cond_b

    .line 246
    .line 247
    iget-object v4, v4, Lco/notix/op;->a:Ljava/lang/Long;

    .line 248
    .line 249
    goto :goto_b

    .line 250
    :cond_b
    move-object v4, v3

    .line 251
    :goto_b
    const-string v5, "sender_id"

    .line 252
    .line 253
    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 254
    .line 255
    .line 256
    const-string v4, "push"

    .line 257
    .line 258
    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 259
    .line 260
    .line 261
    const-string v2, "notifications"

    .line 262
    .line 263
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 264
    .line 265
    .line 266
    new-instance v1, Lorg/json/JSONObject;

    .line 267
    .line 268
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 269
    .line 270
    .line 271
    iget-object v2, p1, Lco/notix/sp;->d:Lco/notix/mp;

    .line 272
    .line 273
    if-eqz v2, :cond_c

    .line 274
    .line 275
    iget-object v2, v2, Lco/notix/mp;->a:Ljava/lang/Long;

    .line 276
    .line 277
    goto :goto_c

    .line 278
    :cond_c
    move-object v2, v3

    .line 279
    :goto_c
    const-string v4, "interval_sec"

    .line 280
    .line 281
    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 282
    .line 283
    .line 284
    iget-object p1, p1, Lco/notix/sp;->d:Lco/notix/mp;

    .line 285
    .line 286
    if-eqz p1, :cond_d

    .line 287
    .line 288
    iget-object v3, p1, Lco/notix/mp;->b:Ljava/lang/Long;

    .line 289
    .line 290
    :cond_d
    const-string p1, "close_sec"

    .line 291
    .line 292
    invoke-virtual {v1, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 293
    .line 294
    .line 295
    const-string p1, "lsi"

    .line 296
    .line 297
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 298
    .line 299
    .line 300
    return-object v0
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
.end method
