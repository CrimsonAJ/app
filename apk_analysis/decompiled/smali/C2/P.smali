.class public final synthetic LC2/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LC2/P;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/anilab/data/local/db/AppDatabase_Impl;)V
    .locals 0

    .line 2
    const/16 p1, 0x11

    iput p1, p0, LC2/P;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x4

    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x1

    .line 7
    iget v6, p0, LC2/P;->a:I

    .line 8
    .line 9
    packed-switch v6, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Lz2/a;

    .line 13
    .line 14
    invoke-direct {v0, v4}, Lz2/a;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance v0, Li8/E;

    .line 19
    .line 20
    invoke-direct {v0}, Li8/E;-><init>()V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_1
    new-instance v0, Ln2/h;

    .line 25
    .line 26
    invoke-direct {v0}, Ln2/h;-><init>()V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_2
    new-instance v0, Li2/j;

    .line 31
    .line 32
    sget-object v1, Li2/j;->f:LN1/b;

    .line 33
    .line 34
    invoke-direct {v0, v1}, LF0/I;-><init>(LF0/c;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_3
    sget-object v0, LA7/n;->a:LA7/n;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_4
    new-instance v0, LV1/b;

    .line 42
    .line 43
    sget-object v1, LU1/a;->f:LN1/b;

    .line 44
    .line 45
    invoke-direct {v0, v1}, LF0/I;-><init>(LF0/c;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_5
    new-instance v0, LU1/m;

    .line 50
    .line 51
    invoke-direct {v0}, LU1/m;-><init>()V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_6
    new-instance v0, LU1/a;

    .line 56
    .line 57
    invoke-direct {v0}, LU1/a;-><init>()V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_7
    new-instance v0, LU1/a;

    .line 62
    .line 63
    invoke-direct {v0}, LU1/a;-><init>()V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_8
    new-instance v0, LU1/a;

    .line 68
    .line 69
    invoke-direct {v0}, LU1/a;-><init>()V

    .line 70
    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_9
    new-instance v0, Ln2/h;

    .line 74
    .line 75
    invoke-direct {v0}, Ln2/h;-><init>()V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_a
    new-instance v0, LT1/c;

    .line 80
    .line 81
    sget-object v1, LT1/c;->f:LN1/b;

    .line 82
    .line 83
    invoke-direct {v0, v1}, LF0/I;-><init>(LF0/c;)V

    .line 84
    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_b
    :try_start_0
    sget-object v6, LR0/c;->c:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-interface {v6}, LA7/e;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    check-cast v6, Ljava/lang/reflect/Method;

    .line 94
    .line 95
    if-eqz v6, :cond_0

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    if-eqz v6, :cond_0

    .line 102
    .line 103
    const-string v7, "beginTransaction"

    .line 104
    .line 105
    new-array v3, v3, [Ljava/lang/Class;

    .line 106
    .line 107
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 108
    .line 109
    aput-object v8, v3, v4

    .line 110
    .line 111
    const-class v4, Landroid/database/sqlite/SQLiteTransactionListener;

    .line 112
    .line 113
    aput-object v4, v3, v5

    .line 114
    .line 115
    aput-object v8, v3, v2

    .line 116
    .line 117
    const-class v2, Landroid/os/CancellationSignal;

    .line 118
    .line 119
    aput-object v2, v3, v1

    .line 120
    .line 121
    invoke-virtual {v6, v7, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 122
    .line 123
    .line 124
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    :catchall_0
    :cond_0
    return-object v0

    .line 126
    :pswitch_c
    :try_start_1
    const-class v1, Landroid/database/sqlite/SQLiteDatabase;

    .line 127
    .line 128
    const-string v2, "getThreadSession"

    .line 129
    .line 130
    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 135
    .line 136
    .line 137
    move-object v0, v1

    .line 138
    :catchall_1
    return-object v0

    .line 139
    :pswitch_d
    sget v0, Lcom/anilab/android/ui/activity/MainActivity;->k0:I

    .line 140
    .line 141
    new-instance v0, Landroid/net/NetworkRequest$Builder;

    .line 142
    .line 143
    invoke-direct {v0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 144
    .line 145
    .line 146
    const/16 v6, 0xc

    .line 147
    .line 148
    invoke-virtual {v0, v6}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0, v5}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0, v4}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0, v1}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {v0, v2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0, v3}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    return-object v0

    .line 177
    :pswitch_e
    new-instance v0, LK1/f;

    .line 178
    .line 179
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    return-object v0

    .line 183
    :pswitch_f
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 184
    .line 185
    return-object v0

    .line 186
    :pswitch_10
    new-instance v0, Lz2/a;

    .line 187
    .line 188
    invoke-direct {v0, v5}, Lz2/a;-><init>(I)V

    .line 189
    .line 190
    .line 191
    new-instance v1, Li8/D;

    .line 192
    .line 193
    invoke-direct {v1}, Li8/D;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v0}, Li8/D;->d(Li8/s;)V

    .line 197
    .line 198
    .line 199
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 200
    .line 201
    invoke-virtual {v1}, Li8/D;->c()V

    .line 202
    .line 203
    .line 204
    const-wide/16 v2, 0x1e

    .line 205
    .line 206
    invoke-virtual {v1, v2, v3}, Li8/D;->e(J)V

    .line 207
    .line 208
    .line 209
    new-instance v0, Li8/E;

    .line 210
    .line 211
    invoke-direct {v0, v1}, Li8/E;-><init>(Li8/D;)V

    .line 212
    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
