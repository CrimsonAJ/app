.class public final Lq8/i;
.super Lm8/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lq8/i;->e:I

    iput-object p2, p0, Lq8/i;->f:Ljava/lang/Object;

    iput-object p3, p0, Lq8/i;->g:Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lm8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x0

    .line 5
    iget v0, v1, Lq8/i;->e:I

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lq8/i;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LM1/w;

    .line 13
    .line 14
    iget-object v6, v1, Lq8/i;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v6, Lq8/z;

    .line 17
    .line 18
    new-instance v7, Lkotlin/jvm/internal/o;

    .line 19
    .line 20
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, LM1/w;->c:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v8, v0

    .line 26
    check-cast v8, Lq8/n;

    .line 27
    .line 28
    iget-object v9, v8, Lq8/n;->w:Lq8/w;

    .line 29
    .line 30
    monitor-enter v9

    .line 31
    :try_start_0
    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    :try_start_1
    iget-object v0, v8, Lq8/n;->q:Lq8/z;

    .line 33
    .line 34
    new-instance v10, Lq8/z;

    .line 35
    .line 36
    invoke-direct {v10}, Lq8/z;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v10, v0}, Lq8/z;->b(Lq8/z;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v10, v6}, Lq8/z;->b(Lq8/z;)V

    .line 43
    .line 44
    .line 45
    iput-object v10, v7, Lkotlin/jvm/internal/o;->a:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v10}, Lq8/z;->a()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    int-to-long v10, v6

    .line 52
    invoke-virtual {v0}, Lq8/z;->a()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    int-to-long v12, v0

    .line 57
    sub-long/2addr v10, v12

    .line 58
    const-wide/16 v12, 0x0

    .line 59
    .line 60
    cmp-long v6, v10, v12

    .line 61
    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    iget-object v0, v8, Lq8/n;->b:Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_0

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    iget-object v0, v8, Lq8/n;->b:Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    new-array v14, v3, [Lq8/v;

    .line 80
    .line 81
    invoke-interface {v0, v14}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, [Lq8/v;

    .line 86
    .line 87
    :goto_0
    move-object v14, v0

    .line 88
    goto :goto_2

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    goto :goto_5

    .line 91
    :cond_1
    :goto_1
    const/4 v0, 0x0

    .line 92
    goto :goto_0

    .line 93
    :goto_2
    iget-object v0, v7, Lkotlin/jvm/internal/o;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lq8/z;

    .line 96
    .line 97
    const-string v15, "<set-?>"

    .line 98
    .line 99
    invoke-static {v0, v15}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iput-object v0, v8, Lq8/n;->q:Lq8/z;

    .line 103
    .line 104
    iget-object v0, v8, Lq8/n;->j:Lm8/b;

    .line 105
    .line 106
    new-instance v15, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-wide/16 v16, -0x1

    .line 112
    .line 113
    iget-object v4, v8, Lq8/n;->c:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v4, " onSettings"

    .line 119
    .line 120
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    new-instance v5, Lq8/i;

    .line 128
    .line 129
    invoke-direct {v5, v4, v8, v7, v3}, Lq8/i;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v5, v12, v13}, Lm8/b;->c(Lm8/a;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    .line 134
    .line 135
    :try_start_2
    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 136
    :try_start_3
    iget-object v0, v8, Lq8/n;->w:Lq8/w;

    .line 137
    .line 138
    iget-object v4, v7, Lkotlin/jvm/internal/o;->a:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v4, Lq8/z;

    .line 141
    .line 142
    invoke-virtual {v0, v4}, Lq8/w;->a(Lq8/z;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :catchall_1
    move-exception v0

    .line 147
    goto :goto_6

    .line 148
    :catch_0
    move-exception v0

    .line 149
    :try_start_4
    invoke-virtual {v8, v2, v2, v0}, Lq8/n;->a(IILjava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 150
    .line 151
    .line 152
    :goto_3
    monitor-exit v9

    .line 153
    if-eqz v14, :cond_3

    .line 154
    .line 155
    array-length v0, v14

    .line 156
    :goto_4
    if-ge v3, v0, :cond_3

    .line 157
    .line 158
    aget-object v2, v14, v3

    .line 159
    .line 160
    monitor-enter v2

    .line 161
    :try_start_5
    iget-wide v4, v2, Lq8/v;->f:J

    .line 162
    .line 163
    add-long/2addr v4, v10

    .line 164
    iput-wide v4, v2, Lq8/v;->f:J

    .line 165
    .line 166
    if-lez v6, :cond_2

    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 169
    .line 170
    .line 171
    :cond_2
    monitor-exit v2

    .line 172
    add-int/lit8 v3, v3, 0x1

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :catchall_2
    move-exception v0

    .line 176
    monitor-exit v2

    .line 177
    throw v0

    .line 178
    :cond_3
    return-wide v16

    .line 179
    :goto_5
    :try_start_6
    monitor-exit v8

    .line 180
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 181
    :goto_6
    monitor-exit v9

    .line 182
    throw v0

    .line 183
    :pswitch_0
    const-wide/16 v16, -0x1

    .line 184
    .line 185
    :try_start_7
    iget-object v0, v1, Lq8/i;->f:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Lq8/n;

    .line 188
    .line 189
    iget-object v0, v0, Lq8/n;->a:Lq8/h;

    .line 190
    .line 191
    iget-object v3, v1, Lq8/i;->g:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v3, Lq8/v;

    .line 194
    .line 195
    invoke-virtual {v0, v3}, Lq8/h;->b(Lq8/v;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 196
    .line 197
    .line 198
    goto :goto_7

    .line 199
    :catch_1
    move-exception v0

    .line 200
    sget-object v3, Ls8/p;->a:Ls8/p;

    .line 201
    .line 202
    sget-object v3, Ls8/p;->a:Ls8/p;

    .line 203
    .line 204
    new-instance v4, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v5, "Http2Connection.Listener failure for "

    .line 207
    .line 208
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    iget-object v5, v1, Lq8/i;->f:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v5, Lq8/n;

    .line 214
    .line 215
    iget-object v5, v5, Lq8/n;->c:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    const/4 v3, 0x4

    .line 228
    invoke-static {v4, v3, v0}, Ls8/p;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 229
    .line 230
    .line 231
    :try_start_8
    iget-object v3, v1, Lq8/i;->g:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v3, Lq8/v;

    .line 234
    .line 235
    invoke-virtual {v3, v2, v0}, Lq8/v;->c(ILjava/io/IOException;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    .line 236
    .line 237
    .line 238
    :catch_2
    :goto_7
    return-wide v16

    .line 239
    :pswitch_1
    const-wide/16 v16, -0x1

    .line 240
    .line 241
    iget-object v0, v1, Lq8/i;->f:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, Lq8/n;

    .line 244
    .line 245
    iget-object v2, v0, Lq8/n;->a:Lq8/h;

    .line 246
    .line 247
    iget-object v3, v1, Lq8/i;->g:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v3, Lkotlin/jvm/internal/o;

    .line 250
    .line 251
    iget-object v3, v3, Lkotlin/jvm/internal/o;->a:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v3, Lq8/z;

    .line 254
    .line 255
    invoke-virtual {v2, v0, v3}, Lq8/h;->a(Lq8/n;Lq8/z;)V

    .line 256
    .line 257
    .line 258
    return-wide v16

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
