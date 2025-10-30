.class public final Lu4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:Ly4/b;

.field public static final l:Ljava/lang/Object;

.field public static volatile m:Lu4/b;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lu4/n;

.field public final c:Lu4/h;

.field public final d:Lu4/k;

.field public final e:Lu4/c;

.field public final f:Ly4/r;

.field public final g:Lcom/google/android/gms/internal/cast/g;

.field public final h:Lcom/google/android/gms/internal/cast/q;

.field public final i:Lcom/google/android/gms/internal/cast/w;

.field public final j:Lcom/google/android/gms/internal/cast/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ly4/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "CastContext"

    .line 5
    .line 6
    invoke-direct {v0, v2, v1}, Ly4/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lu4/b;->k:Ly4/b;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lu4/b;->l:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
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

.method public constructor <init>(Landroid/content/Context;Lu4/c;Ljava/util/List;Lcom/google/android/gms/internal/cast/t;Ly4/r;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lu4/b;->a:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lu4/b;->e:Lu4/c;

    .line 10
    .line 11
    iput-object p5, p0, Lu4/b;->f:Ly4/r;

    .line 12
    .line 13
    new-instance v3, Lcom/google/android/gms/internal/cast/q;

    .line 14
    .line 15
    invoke-direct {v3, p1}, Lcom/google/android/gms/internal/cast/q;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    iput-object v3, p0, Lu4/b;->h:Lcom/google/android/gms/internal/cast/q;

    .line 19
    .line 20
    iget-object v3, p4, Lcom/google/android/gms/internal/cast/t;->j:Lcom/google/android/gms/internal/cast/w;

    .line 21
    .line 22
    iput-object v3, p0, Lu4/b;->i:Lcom/google/android/gms/internal/cast/w;

    .line 23
    .line 24
    iget-object v3, p2, Lu4/c;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v4, 0x0

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    new-instance v3, Lcom/google/android/gms/internal/cast/i;

    .line 34
    .line 35
    invoke-direct {v3, p1, p2, p4}, Lcom/google/android/gms/internal/cast/i;-><init>(Landroid/content/Context;Lu4/c;Lcom/google/android/gms/internal/cast/t;)V

    .line 36
    .line 37
    .line 38
    iput-object v3, p0, Lu4/b;->j:Lcom/google/android/gms/internal/cast/i;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iput-object v4, p0, Lu4/b;->j:Lcom/google/android/gms/internal/cast/i;

    .line 42
    .line 43
    :goto_0
    new-instance v3, Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    iget-object v5, p0, Lu4/b;->j:Lcom/google/android/gms/internal/cast/i;

    .line 49
    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    iget-object v6, v5, Lcom/google/android/gms/internal/cast/i;->b:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v5, v5, Lcom/google/android/gms/internal/cast/i;->c:Lu4/j;

    .line 55
    .line 56
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_1
    if-eqz p3, :cond_2

    .line 60
    .line 61
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_2

    .line 70
    .line 71
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    check-cast v5, Lcom/google/android/gms/internal/cast/i;

    .line 76
    .line 77
    const-string v6, "Additional SessionProvider must not be null."

    .line 78
    .line 79
    invoke-static {v5, v6}, LF4/y;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string v6, "Category for SessionProvider must not be null or empty string."

    .line 83
    .line 84
    iget-object v7, v5, Lcom/google/android/gms/internal/cast/i;->b:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v7, v6}, LF4/y;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    xor-int/2addr v6, v2

    .line 94
    new-instance v8, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v9, "SessionProvider for category "

    .line 97
    .line 98
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v9, " already added"

    .line 105
    .line 106
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    invoke-static {v8, v6}, LF4/y;->a(Ljava/lang/String;Z)V

    .line 114
    .line 115
    .line 116
    iget-object v5, v5, Lcom/google/android/gms/internal/cast/i;->c:Lu4/j;

    .line 117
    .line 118
    invoke-virtual {v3, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_2
    new-instance p3, Lu4/B;

    .line 123
    .line 124
    invoke-direct {p3, v2}, Lu4/B;-><init>(I)V

    .line 125
    .line 126
    .line 127
    iput-object p3, p2, Lu4/c;->p:Lu4/B;

    .line 128
    .line 129
    :try_start_0
    invoke-static {p1, p2, p4, v3}, Lcom/google/android/gms/internal/cast/h;->a(Landroid/content/Context;Lu4/c;Lcom/google/android/gms/internal/cast/t;Ljava/util/HashMap;)Lu4/n;

    .line 130
    .line 131
    .line 132
    move-result-object p3
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_3

    .line 133
    iput-object p3, p0, Lu4/b;->b:Lu4/n;

    .line 134
    .line 135
    :try_start_1
    move-object p4, p3

    .line 136
    check-cast p4, Lu4/l;

    .line 137
    .line 138
    invoke-virtual {p4}, LS4/a;->Q()Landroid/os/Parcel;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    const/4 v5, 0x6

    .line 143
    invoke-virtual {p4, v3, v5}, LS4/a;->f1(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 144
    .line 145
    .line 146
    move-result-object p4

    .line 147
    invoke-virtual {p4}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    if-nez v3, :cond_3

    .line 152
    .line 153
    move-object v6, v4

    .line 154
    goto :goto_2

    .line 155
    :cond_3
    const-string v5, "com.google.android.gms.cast.framework.IDiscoveryManager"

    .line 156
    .line 157
    invoke-interface {v3, v5}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    instance-of v7, v6, Lu4/r;

    .line 162
    .line 163
    if-eqz v7, :cond_4

    .line 164
    .line 165
    check-cast v6, Lu4/r;

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_4
    new-instance v6, Lu4/r;

    .line 169
    .line 170
    invoke-direct {v6, v3, v5, v1}, LS4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 171
    .line 172
    .line 173
    :goto_2
    invoke-virtual {p4}, Landroid/os/Parcel;->recycle()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2

    .line 174
    .line 175
    .line 176
    new-instance p4, Lu4/k;

    .line 177
    .line 178
    invoke-direct {p4, v6}, Lu4/k;-><init>(Lu4/r;)V

    .line 179
    .line 180
    .line 181
    iput-object p4, p0, Lu4/b;->d:Lu4/k;

    .line 182
    .line 183
    :try_start_2
    move-object p4, p3

    .line 184
    check-cast p4, Lu4/l;

    .line 185
    .line 186
    invoke-virtual {p4}, LS4/a;->Q()Landroid/os/Parcel;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    const/4 v5, 0x5

    .line 191
    invoke-virtual {p4, v3, v5}, LS4/a;->f1(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 192
    .line 193
    .line 194
    move-result-object p4

    .line 195
    invoke-virtual {p4}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    if-nez v3, :cond_5

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_5
    const-string v4, "com.google.android.gms.cast.framework.ISessionManager"

    .line 203
    .line 204
    invoke-interface {v3, v4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    instance-of v6, v5, Lu4/y;

    .line 209
    .line 210
    if-eqz v6, :cond_6

    .line 211
    .line 212
    move-object v4, v5

    .line 213
    check-cast v4, Lu4/y;

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_6
    new-instance v5, Lu4/y;

    .line 217
    .line 218
    invoke-direct {v5, v3, v4, v1}, LS4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    .line 219
    .line 220
    .line 221
    move-object v4, v5

    .line 222
    :goto_3
    invoke-virtual {p4}, Landroid/os/Parcel;->recycle()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    .line 223
    .line 224
    .line 225
    new-instance p4, Lu4/h;

    .line 226
    .line 227
    invoke-direct {p4, v4, p1}, Lu4/h;-><init>(Lu4/y;Landroid/content/Context;)V

    .line 228
    .line 229
    .line 230
    iput-object p4, p0, Lu4/b;->c:Lu4/h;

    .line 231
    .line 232
    const-string v3, "The log tag cannot be null or empty."

    .line 233
    .line 234
    const-string v4, "PrecacheManager"

    .line 235
    .line 236
    invoke-static {v4, v3}, LF4/y;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    iget-object v3, p0, Lu4/b;->i:Lcom/google/android/gms/internal/cast/w;

    .line 240
    .line 241
    if-eqz v3, :cond_7

    .line 242
    .line 243
    iput-object p4, v3, Lcom/google/android/gms/internal/cast/w;->f:Lu4/h;

    .line 244
    .line 245
    iget-object p4, v3, Lcom/google/android/gms/internal/cast/w;->c:LT4/d;

    .line 246
    .line 247
    invoke-static {p4}, LF4/y;->h(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    new-instance v4, Lcom/google/android/gms/internal/cast/v;

    .line 251
    .line 252
    invoke-direct {v4, v3, v2}, Lcom/google/android/gms/internal/cast/v;-><init>(Lcom/google/android/gms/internal/cast/w;I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p4, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 256
    .line 257
    .line 258
    :cond_7
    new-instance p4, Lcom/google/android/gms/internal/cast/E;

    .line 259
    .line 260
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    instance-of v4, v3, Lcom/google/android/gms/internal/cast/x2;

    .line 265
    .line 266
    if-eqz v4, :cond_8

    .line 267
    .line 268
    check-cast v3, Lcom/google/android/gms/internal/cast/x2;

    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_8
    instance-of v4, v3, Ljava/util/concurrent/ScheduledExecutorService;

    .line 272
    .line 273
    if-eqz v4, :cond_9

    .line 274
    .line 275
    new-instance v4, Lcom/google/android/gms/internal/cast/B2;

    .line 276
    .line 277
    check-cast v3, Ljava/util/concurrent/ScheduledExecutorService;

    .line 278
    .line 279
    invoke-direct {v4, v3}, Lcom/google/android/gms/internal/cast/B2;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 280
    .line 281
    .line 282
    :goto_4
    move-object v3, v4

    .line 283
    goto :goto_5

    .line 284
    :cond_9
    new-instance v4, Lcom/google/android/gms/internal/cast/y2;

    .line 285
    .line 286
    invoke-direct {v4, v3}, Lcom/google/android/gms/internal/cast/y2;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 287
    .line 288
    .line 289
    goto :goto_4

    .line 290
    :goto_5
    invoke-direct {p4, p1, v3}, Lcom/google/android/gms/internal/cast/E;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/cast/x2;)V

    .line 291
    .line 292
    .line 293
    const-string p1, "BaseNetUtils"

    .line 294
    .line 295
    const-string v3, "The log tag cannot be null or empty."

    .line 296
    .line 297
    invoke-static {p1, v3}, LF4/y;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    new-array p1, v0, [Ljava/lang/Object;

    .line 301
    .line 302
    sget-object v3, Lcom/google/android/gms/internal/cast/E;->j:Ly4/b;

    .line 303
    .line 304
    const-string v4, "Start monitoring connectivity changes"

    .line 305
    .line 306
    invoke-virtual {v3, v4, p1}, Ly4/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    iget-boolean p1, p4, Lcom/google/android/gms/internal/cast/E;->f:Z

    .line 310
    .line 311
    if-eqz p1, :cond_a

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_a
    iget-object p1, p4, Lcom/google/android/gms/internal/cast/E;->c:Landroid/net/ConnectivityManager;

    .line 315
    .line 316
    if-eqz p1, :cond_c

    .line 317
    .line 318
    iget-object v3, p4, Lcom/google/android/gms/internal/cast/E;->g:Landroid/content/Context;

    .line 319
    .line 320
    const-string v4, "android.permission.ACCESS_NETWORK_STATE"

    .line 321
    .line 322
    invoke-static {v3, v4}, LE/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    if-nez v3, :cond_c

    .line 327
    .line 328
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    if-eqz v3, :cond_b

    .line 333
    .line 334
    invoke-virtual {p1, v3}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    if-eqz v4, :cond_b

    .line 339
    .line 340
    invoke-virtual {p4, v3, v4}, Lcom/google/android/gms/internal/cast/E;->a(Landroid/net/Network;Landroid/net/LinkProperties;)V

    .line 341
    .line 342
    .line 343
    :cond_b
    new-instance v3, Landroid/net/NetworkRequest$Builder;

    .line 344
    .line 345
    invoke-direct {v3}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v3, v2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-virtual {v3}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    iget-object v4, p4, Lcom/google/android/gms/internal/cast/E;->b:LB1/f;

    .line 357
    .line 358
    invoke-virtual {p1, v3, v4}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 359
    .line 360
    .line 361
    iput-boolean v2, p4, Lcom/google/android/gms/internal/cast/E;->f:Z

    .line 362
    .line 363
    :cond_c
    :goto_6
    new-instance p1, Lcom/google/android/gms/internal/cast/g;

    .line 364
    .line 365
    invoke-direct {p1}, Lcom/google/android/gms/internal/cast/g;-><init>()V

    .line 366
    .line 367
    .line 368
    iput-object p1, p0, Lu4/b;->g:Lcom/google/android/gms/internal/cast/g;

    .line 369
    .line 370
    :try_start_3
    check-cast p3, Lu4/l;

    .line 371
    .line 372
    invoke-virtual {p3}, LS4/a;->Q()Landroid/os/Parcel;

    .line 373
    .line 374
    .line 375
    move-result-object p4

    .line 376
    invoke-static {p4, p1}, Lcom/google/android/gms/internal/cast/C;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p3, p4, v1}, LS4/a;->g1(Landroid/os/Parcel;I)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    .line 380
    .line 381
    .line 382
    iget-object p3, p0, Lu4/b;->h:Lcom/google/android/gms/internal/cast/q;

    .line 383
    .line 384
    iget-object p3, p3, Lcom/google/android/gms/internal/cast/q;->a:Lcom/google/android/gms/internal/cast/p;

    .line 385
    .line 386
    iget-object p1, p1, Lcom/google/android/gms/internal/cast/g;->g:Ljava/util/Set;

    .line 387
    .line 388
    invoke-interface {p1, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    iget-object p1, p2, Lu4/c;->l:Ljava/util/ArrayList;

    .line 392
    .line 393
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 398
    .line 399
    .line 400
    move-result p1

    .line 401
    if-nez p1, :cond_10

    .line 402
    .line 403
    sget-object p1, Lu4/b;->k:Ly4/b;

    .line 404
    .line 405
    iget-object p2, p0, Lu4/b;->e:Lu4/c;

    .line 406
    .line 407
    iget-object p2, p2, Lu4/c;->l:Ljava/util/ArrayList;

    .line 408
    .line 409
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 410
    .line 411
    .line 412
    move-result-object p2

    .line 413
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object p2

    .line 417
    new-array p3, v0, [Ljava/lang/Object;

    .line 418
    .line 419
    const-string p4, "Setting Route Discovery for appIds: "

    .line 420
    .line 421
    invoke-virtual {p4, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object p2

    .line 425
    iget-object p4, p1, Ly4/b;->a:Ljava/lang/String;

    .line 426
    .line 427
    invoke-virtual {p1, p2, p3}, Ly4/b;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    invoke-static {p4, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 432
    .line 433
    .line 434
    iget-object p1, p0, Lu4/b;->h:Lcom/google/android/gms/internal/cast/q;

    .line 435
    .line 436
    iget-object p2, p0, Lu4/b;->e:Lu4/c;

    .line 437
    .line 438
    iget-object p2, p2, Lu4/c;->l:Ljava/util/ArrayList;

    .line 439
    .line 440
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 441
    .line 442
    .line 443
    move-result-object p2

    .line 444
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    sget-object p3, Lcom/google/android/gms/internal/cast/q;->f:Ly4/b;

    .line 448
    .line 449
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 450
    .line 451
    .line 452
    move-result p4

    .line 453
    const-string v1, "SetRouteDiscovery for "

    .line 454
    .line 455
    const-string v3, " IDs"

    .line 456
    .line 457
    invoke-static {v1, p4, v3}, LA0/a;->m(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object p4

    .line 461
    new-array v1, v0, [Ljava/lang/Object;

    .line 462
    .line 463
    invoke-virtual {p3, p4, v1}, Ly4/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    new-instance p4, Ljava/util/LinkedHashSet;

    .line 467
    .line 468
    invoke-direct {p4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 469
    .line 470
    .line 471
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 472
    .line 473
    .line 474
    move-result-object p2

    .line 475
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    if-eqz v1, :cond_d

    .line 480
    .line 481
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    check-cast v1, Ljava/lang/String;

    .line 486
    .line 487
    invoke-static {v1}, Lcom/google/android/gms/internal/cast/J;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    invoke-virtual {p4, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    goto :goto_7

    .line 495
    :cond_d
    iget-object p2, p1, Lcom/google/android/gms/internal/cast/q;->c:Ljava/util/Map;

    .line 496
    .line 497
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    new-array v3, v0, [Ljava/lang/Object;

    .line 506
    .line 507
    const-string v4, "resetting routes. appIdToRouteInfo has these appId route keys: "

    .line 508
    .line 509
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-virtual {p3, v1, v3}, Ly4/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    new-instance v1, Ljava/util/HashMap;

    .line 517
    .line 518
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 519
    .line 520
    .line 521
    monitor-enter p2

    .line 522
    :try_start_4
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    :cond_e
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 527
    .line 528
    .line 529
    move-result v4

    .line 530
    if-eqz v4, :cond_f

    .line 531
    .line 532
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    check-cast v4, Ljava/lang/String;

    .line 537
    .line 538
    invoke-static {v4}, Lcom/google/android/gms/internal/cast/J;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v5

    .line 542
    invoke-interface {p2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v5

    .line 546
    check-cast v5, Lcom/google/android/gms/internal/cast/o;

    .line 547
    .line 548
    if-eqz v5, :cond_e

    .line 549
    .line 550
    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    goto :goto_8

    .line 554
    :catchall_0
    move-exception v0

    .line 555
    move-object p1, v0

    .line 556
    goto :goto_9

    .line 557
    :cond_f
    invoke-interface {p2}, Ljava/util/Map;->clear()V

    .line 558
    .line 559
    .line 560
    invoke-interface {p2, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 561
    .line 562
    .line 563
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 564
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 565
    .line 566
    .line 567
    move-result-object p2

    .line 568
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object p2

    .line 572
    new-array v1, v0, [Ljava/lang/Object;

    .line 573
    .line 574
    const-string v3, "Routes reset. appIdToRouteInfo has these appId route keys: "

    .line 575
    .line 576
    invoke-virtual {v3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object p2

    .line 580
    invoke-virtual {p3, p2, v1}, Ly4/b;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    iget-object p3, p1, Lcom/google/android/gms/internal/cast/q;->d:Ljava/util/LinkedHashSet;

    .line 584
    .line 585
    monitor-enter p3

    .line 586
    :try_start_5
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->clear()V

    .line 587
    .line 588
    .line 589
    invoke-virtual {p3, p4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 590
    .line 591
    .line 592
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 593
    invoke-virtual {p1}, Lcom/google/android/gms/internal/cast/q;->o()V

    .line 594
    .line 595
    .line 596
    goto :goto_a

    .line 597
    :catchall_1
    move-exception v0

    .line 598
    move-object p1, v0

    .line 599
    :try_start_6
    monitor-exit p3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 600
    throw p1

    .line 601
    :goto_9
    :try_start_7
    monitor-exit p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 602
    throw p1

    .line 603
    :cond_10
    :goto_a
    const-string v3, "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED"

    .line 604
    .line 605
    const-string v4, "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE"

    .line 606
    .line 607
    const-string v5, "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE"

    .line 608
    .line 609
    const-string v6, "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"

    .line 610
    .line 611
    const-string v7, "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"

    .line 612
    .line 613
    const-string v8, "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED"

    .line 614
    .line 615
    const-string v9, "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS"

    .line 616
    .line 617
    filled-new-array/range {v3 .. v9}, [Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object p1

    .line 621
    invoke-virtual {p5, p1}, Ly4/r;->d([Ljava/lang/String;)Lf5/q;

    .line 622
    .line 623
    .line 624
    move-result-object p1

    .line 625
    new-instance p2, Li/G;

    .line 626
    .line 627
    const/16 p3, 0x10

    .line 628
    .line 629
    invoke-direct {p2, p3, p0}, Li/G;-><init>(ILjava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    sget-object p3, Lf5/j;->a:LD4/q;

    .line 636
    .line 637
    invoke-virtual {p1, p3, p2}, Lf5/q;->d(Ljava/util/concurrent/Executor;Lf5/e;)Lf5/q;

    .line 638
    .line 639
    .line 640
    const-string p1, "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"

    .line 641
    .line 642
    filled-new-array {p1}, [Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object p1

    .line 646
    invoke-static {}, LD4/n;->g()LD4/n;

    .line 647
    .line 648
    .line 649
    move-result-object p2

    .line 650
    new-instance p4, Li/G;

    .line 651
    .line 652
    invoke-direct {p4, p5, p1}, Li/G;-><init>(Ly4/r;[Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    iput-object p4, p2, LD4/n;->e:Ljava/lang/Object;

    .line 656
    .line 657
    new-array p1, v2, [LB4/d;

    .line 658
    .line 659
    sget-object p4, Lt4/v;->d:LB4/d;

    .line 660
    .line 661
    aput-object p4, p1, v0

    .line 662
    .line 663
    iput-object p1, p2, LD4/n;->b:Ljava/lang/Object;

    .line 664
    .line 665
    iput-boolean v0, p2, LD4/n;->c:Z

    .line 666
    .line 667
    const/16 p1, 0x20eb

    .line 668
    .line 669
    iput p1, p2, LD4/n;->d:I

    .line 670
    .line 671
    invoke-virtual {p2}, LD4/n;->f()LD4/n;

    .line 672
    .line 673
    .line 674
    move-result-object p1

    .line 675
    invoke-virtual {p5, v0, p1}, LC4/j;->c(ILD4/n;)Lf5/q;

    .line 676
    .line 677
    .line 678
    move-result-object p1

    .line 679
    new-instance p2, Lf5/o;

    .line 680
    .line 681
    const/16 p4, 0x12

    .line 682
    .line 683
    invoke-direct {p2, p4, p0}, Lf5/o;-><init>(ILjava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    invoke-virtual {p1, p3, p2}, Lf5/q;->d(Ljava/util/concurrent/Executor;Lf5/e;)Lf5/q;

    .line 690
    .line 691
    .line 692
    return-void

    .line 693
    :catch_0
    move-exception v0

    .line 694
    move-object p1, v0

    .line 695
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 696
    .line 697
    const-string p3, "Failed to call addAppVisibilityListener"

    .line 698
    .line 699
    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 700
    .line 701
    .line 702
    throw p2

    .line 703
    :catch_1
    move-exception v0

    .line 704
    move-object p1, v0

    .line 705
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 706
    .line 707
    const-string p3, "Failed to call getSessionManagerImpl"

    .line 708
    .line 709
    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 710
    .line 711
    .line 712
    throw p2

    .line 713
    :catch_2
    move-exception v0

    .line 714
    move-object p1, v0

    .line 715
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 716
    .line 717
    const-string p3, "Failed to call getDiscoveryManagerImpl"

    .line 718
    .line 719
    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 720
    .line 721
    .line 722
    throw p2

    .line 723
    :catch_3
    move-exception v0

    .line 724
    move-object p1, v0

    .line 725
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 726
    .line 727
    const-string p3, "Failed to call newCastContextImpl"

    .line 728
    .line 729
    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 730
    .line 731
    .line 732
    throw p2
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
.end method

.method public static a(Landroid/content/Context;)Lu4/b;
    .locals 8

    .line 1
    invoke-static {}, LF4/y;->d()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lu4/b;->m:Lu4/b;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    sget-object v1, Lu4/b;->l:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    sget-object v0, Lu4/b;->m:Lu4/b;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3}, Lu4/b;->b(Landroid/content/Context;)Lcom/google/android/exoplayer2/ext/cast/DefaultCastOptionsProvider;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/ext/cast/DefaultCastOptionsProvider;->getCastOptions(Landroid/content/Context;)Lu4/c;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v2, Ly4/r;

    .line 28
    .line 29
    sget-object v6, LC4/b;->E:LC4/a;

    .line 30
    .line 31
    sget-object v7, LC4/i;->c:LC4/i;

    .line 32
    .line 33
    sget-object v5, Ly4/r;->k:LA1/g;

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-direct/range {v2 .. v7}, LC4/j;-><init>(Landroid/content/Context;Li0/y;LA1/g;LC4/b;LC4/i;)V

    .line 37
    .line 38
    .line 39
    new-instance v6, Lcom/google/android/gms/internal/cast/t;

    .line 40
    .line 41
    invoke-static {v3}, Lt0/D;->d(Landroid/content/Context;)Lt0/D;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-direct {v6, v3, v4, v0, v2}, Lcom/google/android/gms/internal/cast/t;-><init>(Landroid/content/Context;Lt0/D;Lu4/c;Ly4/r;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    move-object v7, v2

    .line 49
    :try_start_1
    new-instance v2, Lu4/b;

    .line 50
    .line 51
    invoke-virtual {p0, v3}, Lcom/google/android/exoplayer2/ext/cast/DefaultCastOptionsProvider;->getAdditionalSessionProviders(Landroid/content/Context;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    move-object v4, v0

    .line 56
    invoke-direct/range {v2 .. v7}, Lu4/b;-><init>(Landroid/content/Context;Lu4/c;Ljava/util/List;Lcom/google/android/gms/internal/cast/t;Ly4/r;)V

    .line 57
    .line 58
    .line 59
    sput-object v2, Lu4/b;->m:Lu4/b;
    :try_end_1
    .catch Lu4/e; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    move-object p0, v0

    .line 64
    goto :goto_1

    .line 65
    :catch_0
    move-exception v0

    .line 66
    move-object p0, v0

    .line 67
    :try_start_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 68
    .line 69
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_0
    :goto_0
    monitor-exit v1

    .line 74
    goto :goto_2

    .line 75
    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    throw p0

    .line 77
    :cond_1
    :goto_2
    sget-object p0, Lu4/b;->m:Lu4/b;

    .line 78
    .line 79
    return-object p0
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

.method public static b(Landroid/content/Context;)Lcom/google/android/exoplayer2/ext/cast/DefaultCastOptionsProvider;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, LM4/c;->a(Landroid/content/Context;)LM4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v1, 0x80

    .line 10
    .line 11
    invoke-virtual {v0, v1, p0}, LM4/b;->b(ILjava/lang/String;)Landroid/content/pm/ApplicationInfo;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 16
    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lu4/b;->k:Ly4/b;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    new-array v1, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ly4/b;->c([Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    const-string v0, "com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-class v0, Lcom/google/android/exoplayer2/ext/cast/DefaultCastOptionsProvider;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Lcom/google/android/exoplayer2/ext/cast/DefaultCastOptionsProvider;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v0, "The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME."

    .line 60
    .line 61
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    :catch_0
    move-exception p0

    .line 66
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v1, "Failed to initialize CastContext."

    .line 69
    .line 70
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw v0
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
