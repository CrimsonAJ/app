.class public final LA3/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/j;


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;

.field public final c:LA4/r;

.field public final d:Landroid/util/SparseIntArray;

.field public final e:LA3/f;

.field public final f:Landroid/util/SparseArray;

.field public final g:Landroid/util/SparseBooleanArray;

.field public final h:Landroid/util/SparseBooleanArray;

.field public final i:LA3/y;

.field public j:LA3/x;

.field public k:Lq3/l;

.field public l:I

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:LA3/J;

.field public q:I

.field public r:I


# direct methods
.method public constructor <init>(ILl4/x;LA3/f;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LA3/G;->e:LA3/f;

    .line 5
    .line 6
    iput p1, p0, LA3/G;->a:I

    .line 7
    .line 8
    const/4 p3, 0x1

    .line 9
    if-eq p1, p3, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x2

    .line 12
    if-ne p1, p3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LA3/G;->b:Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, LA3/G;->b:Ljava/util/List;

    .line 31
    .line 32
    :goto_1
    new-instance p1, LA4/r;

    .line 33
    .line 34
    const/16 p2, 0x24b8

    .line 35
    .line 36
    new-array p2, p2, [B

    .line 37
    .line 38
    const/4 p3, 0x0

    .line 39
    invoke-direct {p1, p3, p2}, LA4/r;-><init>(I[B)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, LA3/G;->c:LA4/r;

    .line 43
    .line 44
    new-instance p1, Landroid/util/SparseBooleanArray;

    .line 45
    .line 46
    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, LA3/G;->g:Landroid/util/SparseBooleanArray;

    .line 50
    .line 51
    new-instance p2, Landroid/util/SparseBooleanArray;

    .line 52
    .line 53
    invoke-direct {p2}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p2, p0, LA3/G;->h:Landroid/util/SparseBooleanArray;

    .line 57
    .line 58
    new-instance p2, Landroid/util/SparseArray;

    .line 59
    .line 60
    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p2, p0, LA3/G;->f:Landroid/util/SparseArray;

    .line 64
    .line 65
    new-instance v0, Landroid/util/SparseIntArray;

    .line 66
    .line 67
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, LA3/G;->d:Landroid/util/SparseIntArray;

    .line 71
    .line 72
    new-instance v0, LA3/y;

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    invoke-direct {v0, v1}, LA3/y;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, LA3/G;->i:LA3/y;

    .line 79
    .line 80
    sget-object v0, Lq3/l;->e0:Ld0/o;

    .line 81
    .line 82
    iput-object v0, p0, LA3/G;->k:Lq3/l;

    .line 83
    .line 84
    const/4 v0, -0x1

    .line 85
    iput v0, p0, LA3/G;->r:I

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 91
    .line 92
    .line 93
    new-instance p1, Landroid/util/SparseArray;

    .line 94
    .line 95
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    move v1, p3

    .line 103
    :goto_2
    if-ge v1, v0, :cond_2

    .line 104
    .line 105
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->keyAt(I)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, LA3/J;

    .line 114
    .line 115
    invoke-virtual {p2, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    add-int/lit8 v1, v1, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    new-instance p1, LA3/C;

    .line 122
    .line 123
    new-instance v0, LA1/g;

    .line 124
    .line 125
    invoke-direct {v0, p0}, LA1/g;-><init>(LA3/G;)V

    .line 126
    .line 127
    .line 128
    invoke-direct {p1, v0}, LA3/C;-><init>(LA3/B;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, p3, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    const/4 p1, 0x0

    .line 135
    iput-object p1, p0, LA3/G;->p:LA3/J;

    .line 136
    .line 137
    return-void
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
.method public final a()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.end method

.method public final b(JJ)V
    .locals 10

    .line 1
    iget p1, p0, LA3/G;->a:I

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eq p1, p2, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v1

    .line 11
    :goto_0
    invoke-static {p1}, Ll4/a;->m(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, LA3/G;->b:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    move v2, v1

    .line 21
    :goto_1
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    if-ge v2, p2, :cond_5

    .line 24
    .line 25
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Ll4/x;

    .line 30
    .line 31
    invoke-virtual {v5}, Ll4/x;->d()J

    .line 32
    .line 33
    .line 34
    move-result-wide v6

    .line 35
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    cmp-long v6, v6, v8

    .line 41
    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    move v6, v0

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    move v6, v1

    .line 47
    :goto_2
    if-nez v6, :cond_3

    .line 48
    .line 49
    invoke-virtual {v5}, Ll4/x;->c()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    cmp-long v8, v6, v8

    .line 54
    .line 55
    if-eqz v8, :cond_2

    .line 56
    .line 57
    cmp-long v3, v6, v3

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    cmp-long v3, v6, p3

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    move v6, v0

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    move v6, v1

    .line 68
    :cond_3
    :goto_3
    if-eqz v6, :cond_4

    .line 69
    .line 70
    invoke-virtual {v5, p3, p4}, Ll4/x;->e(J)V

    .line 71
    .line 72
    .line 73
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    cmp-long p1, p3, v3

    .line 77
    .line 78
    if-eqz p1, :cond_6

    .line 79
    .line 80
    iget-object p1, p0, LA3/G;->j:LA3/x;

    .line 81
    .line 82
    if-eqz p1, :cond_6

    .line 83
    .line 84
    invoke-virtual {p1, p3, p4}, LA3/x;->d(J)V

    .line 85
    .line 86
    .line 87
    :cond_6
    iget-object p1, p0, LA3/G;->c:LA4/r;

    .line 88
    .line 89
    invoke-virtual {p1, v1}, LA4/r;->E(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, LA3/G;->d:Landroid/util/SparseIntArray;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 95
    .line 96
    .line 97
    move p1, v1

    .line 98
    :goto_4
    iget-object p2, p0, LA3/G;->f:Landroid/util/SparseArray;

    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    if-ge p1, p3, :cond_7

    .line 105
    .line 106
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    check-cast p2, LA3/J;

    .line 111
    .line 112
    invoke-interface {p2}, LA3/J;->a()V

    .line 113
    .line 114
    .line 115
    add-int/lit8 p1, p1, 0x1

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_7
    iput v1, p0, LA3/G;->q:I

    .line 119
    .line 120
    return-void
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

.method public final f(Lq3/k;Lc7/j;)I
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    check-cast v2, Lq3/g;

    .line 8
    .line 9
    iget-wide v12, v2, Lq3/g;->c:J

    .line 10
    .line 11
    iget-boolean v2, v0, LA3/G;->m:Z

    .line 12
    .line 13
    const/16 v3, 0x47

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    const-wide/16 v17, -0x1

    .line 18
    .line 19
    iget v6, v0, LA3/G;->a:I

    .line 20
    .line 21
    const/4 v7, 0x2

    .line 22
    if-eqz v2, :cond_14

    .line 23
    .line 24
    cmp-long v2, v12, v17

    .line 25
    .line 26
    iget-object v10, v0, LA3/G;->i:LA3/y;

    .line 27
    .line 28
    const-wide/16 v14, 0x0

    .line 29
    .line 30
    if-eqz v2, :cond_10

    .line 31
    .line 32
    if-eq v6, v7, :cond_10

    .line 33
    .line 34
    iget-boolean v2, v10, LA3/y;->d:Z

    .line 35
    .line 36
    if-nez v2, :cond_10

    .line 37
    .line 38
    iget v2, v0, LA3/G;->r:I

    .line 39
    .line 40
    if-gtz v2, :cond_0

    .line 41
    .line 42
    move-object/from16 v1, p1

    .line 43
    .line 44
    check-cast v1, Lq3/g;

    .line 45
    .line 46
    invoke-virtual {v10, v1}, LA3/y;->a(Lq3/g;)V

    .line 47
    .line 48
    .line 49
    return v4

    .line 50
    :cond_0
    iget-boolean v6, v10, LA3/y;->f:Z

    .line 51
    .line 52
    iget-object v7, v10, LA3/y;->c:LA4/r;

    .line 53
    .line 54
    const v11, 0x1b8a0

    .line 55
    .line 56
    .line 57
    if-nez v6, :cond_7

    .line 58
    .line 59
    move-object/from16 v6, p1

    .line 60
    .line 61
    check-cast v6, Lq3/g;

    .line 62
    .line 63
    int-to-long v11, v11

    .line 64
    iget-wide v13, v6, Lq3/g;->c:J

    .line 65
    .line 66
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide v11

    .line 70
    long-to-int v11, v11

    .line 71
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    int-to-long v8, v11

    .line 77
    sub-long/2addr v13, v8

    .line 78
    iget-wide v8, v6, Lq3/g;->d:J

    .line 79
    .line 80
    cmp-long v8, v8, v13

    .line 81
    .line 82
    if-eqz v8, :cond_1

    .line 83
    .line 84
    iput-wide v13, v1, Lc7/j;->a:J

    .line 85
    .line 86
    return v5

    .line 87
    :cond_1
    invoke-virtual {v7, v11}, LA4/r;->E(I)V

    .line 88
    .line 89
    .line 90
    iput v4, v6, Lq3/g;->f:I

    .line 91
    .line 92
    iget-object v1, v7, LA4/r;->c:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, [B

    .line 95
    .line 96
    invoke-virtual {v6, v1, v4, v11, v4}, Lq3/g;->t([BIIZ)Z

    .line 97
    .line 98
    .line 99
    iget v1, v7, LA4/r;->a:I

    .line 100
    .line 101
    iget v6, v7, LA4/r;->b:I

    .line 102
    .line 103
    add-int/lit16 v8, v6, -0xbc

    .line 104
    .line 105
    :goto_0
    if-lt v8, v1, :cond_6

    .line 106
    .line 107
    iget-object v9, v7, LA4/r;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v9, [B

    .line 110
    .line 111
    const/4 v11, -0x4

    .line 112
    move v12, v4

    .line 113
    :goto_1
    const/4 v13, 0x4

    .line 114
    if-gt v11, v13, :cond_5

    .line 115
    .line 116
    mul-int/lit16 v13, v11, 0xbc

    .line 117
    .line 118
    add-int/2addr v13, v8

    .line 119
    if-lt v13, v1, :cond_3

    .line 120
    .line 121
    if-ge v13, v6, :cond_3

    .line 122
    .line 123
    aget-byte v13, v9, v13

    .line 124
    .line 125
    if-eq v13, v3, :cond_2

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_2
    add-int/2addr v12, v5

    .line 129
    const/4 v13, 0x5

    .line 130
    if-ne v12, v13, :cond_4

    .line 131
    .line 132
    invoke-static {v7, v8, v2}, LM4/a;->y(LA4/r;II)J

    .line 133
    .line 134
    .line 135
    move-result-wide v11

    .line 136
    cmp-long v9, v11, v19

    .line 137
    .line 138
    if-eqz v9, :cond_5

    .line 139
    .line 140
    move-wide v8, v11

    .line 141
    goto :goto_3

    .line 142
    :cond_3
    :goto_2
    move v12, v4

    .line 143
    :cond_4
    add-int/lit8 v11, v11, 0x1

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_5
    add-int/lit8 v8, v8, -0x1

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_6
    move-wide/from16 v8, v19

    .line 150
    .line 151
    :goto_3
    iput-wide v8, v10, LA3/y;->h:J

    .line 152
    .line 153
    iput-boolean v5, v10, LA3/y;->f:Z

    .line 154
    .line 155
    return v4

    .line 156
    :cond_7
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    iget-wide v8, v10, LA3/y;->h:J

    .line 162
    .line 163
    cmp-long v6, v8, v19

    .line 164
    .line 165
    if-nez v6, :cond_8

    .line 166
    .line 167
    move-object/from16 v1, p1

    .line 168
    .line 169
    check-cast v1, Lq3/g;

    .line 170
    .line 171
    invoke-virtual {v10, v1}, LA3/y;->a(Lq3/g;)V

    .line 172
    .line 173
    .line 174
    return v4

    .line 175
    :cond_8
    iget-boolean v6, v10, LA3/y;->e:Z

    .line 176
    .line 177
    if-nez v6, :cond_d

    .line 178
    .line 179
    int-to-long v8, v11

    .line 180
    move-object/from16 v6, p1

    .line 181
    .line 182
    check-cast v6, Lq3/g;

    .line 183
    .line 184
    iget-wide v11, v6, Lq3/g;->c:J

    .line 185
    .line 186
    invoke-static {v8, v9, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 187
    .line 188
    .line 189
    move-result-wide v8

    .line 190
    long-to-int v8, v8

    .line 191
    iget-wide v11, v6, Lq3/g;->d:J

    .line 192
    .line 193
    int-to-long v13, v4

    .line 194
    cmp-long v9, v11, v13

    .line 195
    .line 196
    if-eqz v9, :cond_9

    .line 197
    .line 198
    iput-wide v13, v1, Lc7/j;->a:J

    .line 199
    .line 200
    return v5

    .line 201
    :cond_9
    invoke-virtual {v7, v8}, LA4/r;->E(I)V

    .line 202
    .line 203
    .line 204
    iput v4, v6, Lq3/g;->f:I

    .line 205
    .line 206
    iget-object v1, v7, LA4/r;->c:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v1, [B

    .line 209
    .line 210
    invoke-virtual {v6, v1, v4, v8, v4}, Lq3/g;->t([BIIZ)Z

    .line 211
    .line 212
    .line 213
    iget v1, v7, LA4/r;->a:I

    .line 214
    .line 215
    iget v6, v7, LA4/r;->b:I

    .line 216
    .line 217
    :goto_4
    if-ge v1, v6, :cond_c

    .line 218
    .line 219
    iget-object v8, v7, LA4/r;->c:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v8, [B

    .line 222
    .line 223
    aget-byte v8, v8, v1

    .line 224
    .line 225
    if-eq v8, v3, :cond_a

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_a
    invoke-static {v7, v1, v2}, LM4/a;->y(LA4/r;II)J

    .line 229
    .line 230
    .line 231
    move-result-wide v8

    .line 232
    cmp-long v11, v8, v19

    .line 233
    .line 234
    if-eqz v11, :cond_b

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_b
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_c
    move-wide/from16 v8, v19

    .line 241
    .line 242
    :goto_6
    iput-wide v8, v10, LA3/y;->g:J

    .line 243
    .line 244
    iput-boolean v5, v10, LA3/y;->e:Z

    .line 245
    .line 246
    return v4

    .line 247
    :cond_d
    iget-wide v1, v10, LA3/y;->g:J

    .line 248
    .line 249
    cmp-long v3, v1, v19

    .line 250
    .line 251
    if-nez v3, :cond_e

    .line 252
    .line 253
    move-object/from16 v1, p1

    .line 254
    .line 255
    check-cast v1, Lq3/g;

    .line 256
    .line 257
    invoke-virtual {v10, v1}, LA3/y;->a(Lq3/g;)V

    .line 258
    .line 259
    .line 260
    return v4

    .line 261
    :cond_e
    iget-object v3, v10, LA3/y;->b:Ll4/x;

    .line 262
    .line 263
    invoke-virtual {v3, v1, v2}, Ll4/x;->b(J)J

    .line 264
    .line 265
    .line 266
    move-result-wide v1

    .line 267
    iget-wide v5, v10, LA3/y;->h:J

    .line 268
    .line 269
    invoke-virtual {v3, v5, v6}, Ll4/x;->b(J)J

    .line 270
    .line 271
    .line 272
    move-result-wide v5

    .line 273
    sub-long/2addr v5, v1

    .line 274
    iput-wide v5, v10, LA3/y;->i:J

    .line 275
    .line 276
    cmp-long v1, v5, v14

    .line 277
    .line 278
    if-gez v1, :cond_f

    .line 279
    .line 280
    new-instance v1, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    const-string v2, "Invalid duration: "

    .line 283
    .line 284
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    iget-wide v2, v10, LA3/y;->i:J

    .line 288
    .line 289
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    const-string v2, ". Using TIME_UNSET instead."

    .line 293
    .line 294
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    const-string v2, "TsDurationReader"

    .line 302
    .line 303
    invoke-static {v2, v1}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    move-wide/from16 v1, v19

    .line 307
    .line 308
    iput-wide v1, v10, LA3/y;->i:J

    .line 309
    .line 310
    :cond_f
    move-object/from16 v1, p1

    .line 311
    .line 312
    check-cast v1, Lq3/g;

    .line 313
    .line 314
    invoke-virtual {v10, v1}, LA3/y;->a(Lq3/g;)V

    .line 315
    .line 316
    .line 317
    return v4

    .line 318
    :cond_10
    iget-boolean v2, v0, LA3/G;->n:Z

    .line 319
    .line 320
    if-nez v2, :cond_12

    .line 321
    .line 322
    iput-boolean v5, v0, LA3/G;->n:Z

    .line 323
    .line 324
    move v2, v6

    .line 325
    move v8, v7

    .line 326
    iget-wide v6, v10, LA3/y;->i:J

    .line 327
    .line 328
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    cmp-long v9, v6, v19

    .line 334
    .line 335
    if-eqz v9, :cond_11

    .line 336
    .line 337
    move v9, v3

    .line 338
    new-instance v3, LA3/x;

    .line 339
    .line 340
    iget v11, v0, LA3/G;->r:I

    .line 341
    .line 342
    move/from16 v16, v4

    .line 343
    .line 344
    new-instance v4, Ld0/w;

    .line 345
    .line 346
    const/16 v5, 0xb

    .line 347
    .line 348
    invoke-direct {v4, v5}, Ld0/w;-><init>(I)V

    .line 349
    .line 350
    .line 351
    new-instance v5, LA3/E;

    .line 352
    .line 353
    iget-object v10, v10, LA3/y;->b:Ll4/x;

    .line 354
    .line 355
    invoke-direct {v5, v11, v10}, LA3/E;-><init>(ILl4/x;)V

    .line 356
    .line 357
    .line 358
    const-wide/16 v10, 0x1

    .line 359
    .line 360
    add-long/2addr v10, v6

    .line 361
    move/from16 v20, v16

    .line 362
    .line 363
    const/16 v16, 0x3ac

    .line 364
    .line 365
    move/from16 v22, v8

    .line 366
    .line 367
    move/from16 v21, v9

    .line 368
    .line 369
    move-wide v8, v10

    .line 370
    const-wide/16 v10, 0x0

    .line 371
    .line 372
    move-wide/from16 v23, v14

    .line 373
    .line 374
    const-wide/16 v14, 0xbc

    .line 375
    .line 376
    move/from16 v25, v2

    .line 377
    .line 378
    move/from16 v2, v20

    .line 379
    .line 380
    invoke-direct/range {v3 .. v16}, LA3/x;-><init>(Lq3/c;Lq3/e;JJJJJI)V

    .line 381
    .line 382
    .line 383
    iput-object v3, v0, LA3/G;->j:LA3/x;

    .line 384
    .line 385
    iget-object v4, v0, LA3/G;->k:Lq3/l;

    .line 386
    .line 387
    iget-object v3, v3, LA3/x;->a:Lq3/a;

    .line 388
    .line 389
    invoke-interface {v4, v3}, Lq3/l;->r(Lq3/r;)V

    .line 390
    .line 391
    .line 392
    goto :goto_7

    .line 393
    :cond_11
    move/from16 v25, v2

    .line 394
    .line 395
    move v2, v4

    .line 396
    iget-object v3, v0, LA3/G;->k:Lq3/l;

    .line 397
    .line 398
    new-instance v4, Lq3/m;

    .line 399
    .line 400
    invoke-direct {v4, v6, v7}, Lq3/m;-><init>(J)V

    .line 401
    .line 402
    .line 403
    invoke-interface {v3, v4}, Lq3/l;->r(Lq3/r;)V

    .line 404
    .line 405
    .line 406
    goto :goto_7

    .line 407
    :cond_12
    move v2, v4

    .line 408
    move/from16 v25, v6

    .line 409
    .line 410
    :goto_7
    iget-boolean v3, v0, LA3/G;->o:Z

    .line 411
    .line 412
    if-eqz v3, :cond_13

    .line 413
    .line 414
    iput-boolean v2, v0, LA3/G;->o:Z

    .line 415
    .line 416
    const-wide/16 v3, 0x0

    .line 417
    .line 418
    invoke-virtual {v0, v3, v4, v3, v4}, LA3/G;->b(JJ)V

    .line 419
    .line 420
    .line 421
    move-object/from16 v5, p1

    .line 422
    .line 423
    check-cast v5, Lq3/g;

    .line 424
    .line 425
    iget-wide v5, v5, Lq3/g;->d:J

    .line 426
    .line 427
    cmp-long v5, v5, v3

    .line 428
    .line 429
    if-eqz v5, :cond_13

    .line 430
    .line 431
    iput-wide v3, v1, Lc7/j;->a:J

    .line 432
    .line 433
    const/4 v3, 0x1

    .line 434
    return v3

    .line 435
    :cond_13
    const/4 v3, 0x1

    .line 436
    iget-object v4, v0, LA3/G;->j:LA3/x;

    .line 437
    .line 438
    if-eqz v4, :cond_15

    .line 439
    .line 440
    iget-object v5, v4, LA3/x;->c:Lq3/b;

    .line 441
    .line 442
    if-eqz v5, :cond_15

    .line 443
    .line 444
    move-object/from16 v2, p1

    .line 445
    .line 446
    check-cast v2, Lq3/g;

    .line 447
    .line 448
    invoke-virtual {v4, v2, v1}, LA3/x;->b(Lq3/g;Lc7/j;)I

    .line 449
    .line 450
    .line 451
    move-result v1

    .line 452
    return v1

    .line 453
    :cond_14
    move v2, v4

    .line 454
    move v3, v5

    .line 455
    move/from16 v25, v6

    .line 456
    .line 457
    :cond_15
    iget-object v1, v0, LA3/G;->c:LA4/r;

    .line 458
    .line 459
    iget-object v4, v1, LA4/r;->c:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v4, [B

    .line 462
    .line 463
    iget v5, v1, LA4/r;->a:I

    .line 464
    .line 465
    rsub-int v5, v5, 0x24b8

    .line 466
    .line 467
    const/16 v6, 0xbc

    .line 468
    .line 469
    if-ge v5, v6, :cond_17

    .line 470
    .line 471
    invoke-virtual {v1}, LA4/r;->e()I

    .line 472
    .line 473
    .line 474
    move-result v5

    .line 475
    if-lez v5, :cond_16

    .line 476
    .line 477
    iget v7, v1, LA4/r;->a:I

    .line 478
    .line 479
    invoke-static {v4, v7, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 480
    .line 481
    .line 482
    :cond_16
    invoke-virtual {v1, v5, v4}, LA4/r;->F(I[B)V

    .line 483
    .line 484
    .line 485
    :cond_17
    :goto_8
    invoke-virtual {v1}, LA4/r;->e()I

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    if-ge v5, v6, :cond_19

    .line 490
    .line 491
    iget v5, v1, LA4/r;->b:I

    .line 492
    .line 493
    rsub-int v7, v5, 0x24b8

    .line 494
    .line 495
    move-object/from16 v8, p1

    .line 496
    .line 497
    check-cast v8, Lq3/g;

    .line 498
    .line 499
    invoke-virtual {v8, v4, v5, v7}, Lq3/g;->D([BII)I

    .line 500
    .line 501
    .line 502
    move-result v7

    .line 503
    const/4 v8, -0x1

    .line 504
    if-ne v7, v8, :cond_18

    .line 505
    .line 506
    return v8

    .line 507
    :cond_18
    add-int/2addr v5, v7

    .line 508
    invoke-virtual {v1, v5}, LA4/r;->G(I)V

    .line 509
    .line 510
    .line 511
    goto :goto_8

    .line 512
    :cond_19
    iget v4, v1, LA4/r;->a:I

    .line 513
    .line 514
    iget v5, v1, LA4/r;->b:I

    .line 515
    .line 516
    iget-object v6, v1, LA4/r;->c:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v6, [B

    .line 519
    .line 520
    move v7, v4

    .line 521
    :goto_9
    if-ge v7, v5, :cond_1a

    .line 522
    .line 523
    aget-byte v8, v6, v7

    .line 524
    .line 525
    const/16 v9, 0x47

    .line 526
    .line 527
    if-eq v8, v9, :cond_1a

    .line 528
    .line 529
    add-int/lit8 v7, v7, 0x1

    .line 530
    .line 531
    goto :goto_9

    .line 532
    :cond_1a
    invoke-virtual {v1, v7}, LA4/r;->H(I)V

    .line 533
    .line 534
    .line 535
    add-int/lit16 v6, v7, 0xbc

    .line 536
    .line 537
    const/4 v8, 0x0

    .line 538
    if-le v6, v5, :cond_1c

    .line 539
    .line 540
    iget v5, v0, LA3/G;->q:I

    .line 541
    .line 542
    sub-int/2addr v7, v4

    .line 543
    add-int/2addr v7, v5

    .line 544
    iput v7, v0, LA3/G;->q:I

    .line 545
    .line 546
    move/from16 v4, v25

    .line 547
    .line 548
    const/4 v5, 0x2

    .line 549
    if-ne v4, v5, :cond_1d

    .line 550
    .line 551
    const/16 v9, 0x178

    .line 552
    .line 553
    if-gt v7, v9, :cond_1b

    .line 554
    .line 555
    goto :goto_a

    .line 556
    :cond_1b
    const-string v1, "Cannot find sync byte. Most likely not a Transport Stream."

    .line 557
    .line 558
    invoke-static {v1, v8}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    throw v1

    .line 563
    :cond_1c
    move/from16 v4, v25

    .line 564
    .line 565
    const/4 v5, 0x2

    .line 566
    iput v2, v0, LA3/G;->q:I

    .line 567
    .line 568
    :cond_1d
    :goto_a
    iget v7, v1, LA4/r;->b:I

    .line 569
    .line 570
    if-le v6, v7, :cond_1e

    .line 571
    .line 572
    return v2

    .line 573
    :cond_1e
    invoke-virtual {v1}, LA4/r;->i()I

    .line 574
    .line 575
    .line 576
    move-result v9

    .line 577
    const/high16 v10, 0x800000

    .line 578
    .line 579
    and-int/2addr v10, v9

    .line 580
    if-eqz v10, :cond_1f

    .line 581
    .line 582
    invoke-virtual {v1, v6}, LA4/r;->H(I)V

    .line 583
    .line 584
    .line 585
    return v2

    .line 586
    :cond_1f
    const/high16 v10, 0x400000

    .line 587
    .line 588
    and-int/2addr v10, v9

    .line 589
    if-eqz v10, :cond_20

    .line 590
    .line 591
    move v10, v3

    .line 592
    goto :goto_b

    .line 593
    :cond_20
    move v10, v2

    .line 594
    :goto_b
    const v11, 0x1fff00

    .line 595
    .line 596
    .line 597
    and-int/2addr v11, v9

    .line 598
    shr-int/lit8 v11, v11, 0x8

    .line 599
    .line 600
    and-int/lit8 v14, v9, 0x20

    .line 601
    .line 602
    if-eqz v14, :cond_21

    .line 603
    .line 604
    move v14, v3

    .line 605
    goto :goto_c

    .line 606
    :cond_21
    move v14, v2

    .line 607
    :goto_c
    and-int/lit8 v15, v9, 0x10

    .line 608
    .line 609
    if-eqz v15, :cond_22

    .line 610
    .line 611
    iget-object v8, v0, LA3/G;->f:Landroid/util/SparseArray;

    .line 612
    .line 613
    invoke-virtual {v8, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v8

    .line 617
    check-cast v8, LA3/J;

    .line 618
    .line 619
    :cond_22
    if-nez v8, :cond_23

    .line 620
    .line 621
    invoke-virtual {v1, v6}, LA4/r;->H(I)V

    .line 622
    .line 623
    .line 624
    return v2

    .line 625
    :cond_23
    if-eq v4, v5, :cond_25

    .line 626
    .line 627
    and-int/lit8 v9, v9, 0xf

    .line 628
    .line 629
    iget-object v15, v0, LA3/G;->d:Landroid/util/SparseIntArray;

    .line 630
    .line 631
    move/from16 v19, v3

    .line 632
    .line 633
    add-int/lit8 v3, v9, -0x1

    .line 634
    .line 635
    invoke-virtual {v15, v11, v3}, Landroid/util/SparseIntArray;->get(II)I

    .line 636
    .line 637
    .line 638
    move-result v3

    .line 639
    invoke-virtual {v15, v11, v9}, Landroid/util/SparseIntArray;->put(II)V

    .line 640
    .line 641
    .line 642
    if-ne v3, v9, :cond_24

    .line 643
    .line 644
    invoke-virtual {v1, v6}, LA4/r;->H(I)V

    .line 645
    .line 646
    .line 647
    return v2

    .line 648
    :cond_24
    add-int/lit8 v3, v3, 0x1

    .line 649
    .line 650
    and-int/lit8 v3, v3, 0xf

    .line 651
    .line 652
    if-eq v9, v3, :cond_26

    .line 653
    .line 654
    invoke-interface {v8}, LA3/J;->a()V

    .line 655
    .line 656
    .line 657
    goto :goto_d

    .line 658
    :cond_25
    move/from16 v19, v3

    .line 659
    .line 660
    :cond_26
    :goto_d
    if-eqz v14, :cond_28

    .line 661
    .line 662
    invoke-virtual {v1}, LA4/r;->x()I

    .line 663
    .line 664
    .line 665
    move-result v3

    .line 666
    invoke-virtual {v1}, LA4/r;->x()I

    .line 667
    .line 668
    .line 669
    move-result v9

    .line 670
    and-int/lit8 v9, v9, 0x40

    .line 671
    .line 672
    if-eqz v9, :cond_27

    .line 673
    .line 674
    move v9, v5

    .line 675
    goto :goto_e

    .line 676
    :cond_27
    move v9, v2

    .line 677
    :goto_e
    or-int/2addr v10, v9

    .line 678
    add-int/lit8 v3, v3, -0x1

    .line 679
    .line 680
    invoke-virtual {v1, v3}, LA4/r;->I(I)V

    .line 681
    .line 682
    .line 683
    :cond_28
    iget-boolean v3, v0, LA3/G;->m:Z

    .line 684
    .line 685
    if-eq v4, v5, :cond_29

    .line 686
    .line 687
    if-nez v3, :cond_29

    .line 688
    .line 689
    iget-object v9, v0, LA3/G;->h:Landroid/util/SparseBooleanArray;

    .line 690
    .line 691
    invoke-virtual {v9, v11, v2}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 692
    .line 693
    .line 694
    move-result v9

    .line 695
    if-nez v9, :cond_2a

    .line 696
    .line 697
    :cond_29
    invoke-virtual {v1, v6}, LA4/r;->G(I)V

    .line 698
    .line 699
    .line 700
    invoke-interface {v8, v10, v1}, LA3/J;->c(ILA4/r;)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v1, v7}, LA4/r;->G(I)V

    .line 704
    .line 705
    .line 706
    :cond_2a
    if-eq v4, v5, :cond_2b

    .line 707
    .line 708
    if-nez v3, :cond_2b

    .line 709
    .line 710
    iget-boolean v3, v0, LA3/G;->m:Z

    .line 711
    .line 712
    if-eqz v3, :cond_2b

    .line 713
    .line 714
    cmp-long v3, v12, v17

    .line 715
    .line 716
    if-eqz v3, :cond_2b

    .line 717
    .line 718
    move/from16 v3, v19

    .line 719
    .line 720
    iput-boolean v3, v0, LA3/G;->o:Z

    .line 721
    .line 722
    :cond_2b
    invoke-virtual {v1, v6}, LA4/r;->H(I)V

    .line 723
    .line 724
    .line 725
    return v2
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
.end method

.method public final i(Lq3/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA3/G;->k:Lq3/l;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.end method

.method public final j(Lq3/k;)Z
    .locals 6

    .line 1
    iget-object v0, p0, LA3/G;->c:LA4/r;

    .line 2
    .line 3
    iget-object v0, v0, LA4/r;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, [B

    .line 6
    .line 7
    check-cast p1, Lq3/g;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/16 v2, 0x3ac

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1, v2, v1}, Lq3/g;->t([BIIZ)Z

    .line 13
    .line 14
    .line 15
    move v2, v1

    .line 16
    :goto_0
    const/16 v3, 0xbc

    .line 17
    .line 18
    if-ge v2, v3, :cond_2

    .line 19
    .line 20
    move v3, v1

    .line 21
    :goto_1
    const/4 v4, 0x5

    .line 22
    if-ge v3, v4, :cond_1

    .line 23
    .line 24
    mul-int/lit16 v4, v3, 0xbc

    .line 25
    .line 26
    add-int/2addr v4, v2

    .line 27
    aget-byte v4, v0, v4

    .line 28
    .line 29
    const/16 v5, 0x47

    .line 30
    .line 31
    if-eq v4, v5, :cond_0

    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p1, v2}, Lq3/g;->n(I)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    return p1

    .line 44
    :cond_2
    return v1
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
.end method
