.class public final LD/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Ljava/lang/CharSequence;

.field public f:Ljava/lang/CharSequence;

.field public g:Landroid/app/PendingIntent;

.field public h:Landroid/app/PendingIntent;

.field public i:Landroidx/core/graphics/drawable/IconCompat;

.field public j:I

.field public k:I

.field public l:Z

.field public m:LD/n;

.field public n:Ljava/lang/String;

.field public o:Z

.field public p:Ljava/lang/String;

.field public q:Landroid/os/Bundle;

.field public r:I

.field public s:I

.field public t:Ljava/lang/String;

.field public u:I

.field public final v:Z

.field public final w:Landroid/app/Notification;

.field public final x:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LD/m;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LD/m;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LD/m;->d:Ljava/util/ArrayList;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, LD/m;->l:Z

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput-boolean v1, p0, LD/m;->o:Z

    .line 30
    .line 31
    iput v1, p0, LD/m;->r:I

    .line 32
    .line 33
    iput v1, p0, LD/m;->s:I

    .line 34
    .line 35
    iput v1, p0, LD/m;->u:I

    .line 36
    .line 37
    new-instance v2, Landroid/app/Notification;

    .line 38
    .line 39
    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, LD/m;->w:Landroid/app/Notification;

    .line 43
    .line 44
    iput-object p1, p0, LD/m;->a:Landroid/content/Context;

    .line 45
    .line 46
    iput-object p2, p0, LD/m;->t:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    iput-wide p1, v2, Landroid/app/Notification;->when:J

    .line 53
    .line 54
    const/4 p1, -0x1

    .line 55
    iput p1, v2, Landroid/app/Notification;->audioStreamType:I

    .line 56
    .line 57
    iput v1, p0, LD/m;->k:I

    .line 58
    .line 59
    new-instance p1, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, LD/m;->x:Ljava/util/ArrayList;

    .line 65
    .line 66
    iput-boolean v0, p0, LD/m;->v:Z

    .line 67
    .line 68
    return-void
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

.method public static b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x1400

    .line 9
    .line 10
    if-le v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    return-object p0
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
.method public final a()Landroid/app/Notification;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ll1/g;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v2, v1, Ll1/g;->d:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v0, v1, Ll1/g;->c:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v2, v0, LD/m;->a:Landroid/content/Context;

    .line 23
    .line 24
    iput-object v2, v1, Ll1/g;->a:Ljava/lang/Object;

    .line 25
    .line 26
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v4, 0x1a

    .line 29
    .line 30
    if-lt v3, v4, :cond_0

    .line 31
    .line 32
    iget-object v3, v0, LD/m;->t:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v2, v3}, LD/p;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iput-object v3, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v3, Landroid/app/Notification$Builder;

    .line 42
    .line 43
    iget-object v5, v0, LD/m;->a:Landroid/content/Context;

    .line 44
    .line 45
    invoke-direct {v3, v5}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    iput-object v3, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 49
    .line 50
    :goto_0
    iget-object v3, v0, LD/m;->w:Landroid/app/Notification;

    .line 51
    .line 52
    iget-object v5, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Landroid/app/Notification$Builder;

    .line 55
    .line 56
    iget-wide v6, v3, Landroid/app/Notification;->when:J

    .line 57
    .line 58
    invoke-virtual {v5, v6, v7}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iget v6, v3, Landroid/app/Notification;->icon:I

    .line 63
    .line 64
    iget v7, v3, Landroid/app/Notification;->iconLevel:I

    .line 65
    .line 66
    invoke-virtual {v5, v6, v7}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    iget-object v6, v3, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 71
    .line 72
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    iget-object v6, v3, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    invoke-virtual {v5, v6, v7}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    iget-object v6, v3, Landroid/app/Notification;->vibrate:[J

    .line 84
    .line 85
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    iget v6, v3, Landroid/app/Notification;->ledARGB:I

    .line 90
    .line 91
    iget v8, v3, Landroid/app/Notification;->ledOnMS:I

    .line 92
    .line 93
    iget v9, v3, Landroid/app/Notification;->ledOffMS:I

    .line 94
    .line 95
    invoke-virtual {v5, v6, v8, v9}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iget v6, v3, Landroid/app/Notification;->flags:I

    .line 100
    .line 101
    and-int/lit8 v6, v6, 0x2

    .line 102
    .line 103
    const/4 v8, 0x0

    .line 104
    const/4 v9, 0x1

    .line 105
    if-eqz v6, :cond_1

    .line 106
    .line 107
    move v6, v9

    .line 108
    goto :goto_1

    .line 109
    :cond_1
    move v6, v8

    .line 110
    :goto_1
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    iget v6, v3, Landroid/app/Notification;->flags:I

    .line 115
    .line 116
    and-int/lit8 v6, v6, 0x8

    .line 117
    .line 118
    if-eqz v6, :cond_2

    .line 119
    .line 120
    move v6, v9

    .line 121
    goto :goto_2

    .line 122
    :cond_2
    move v6, v8

    .line 123
    :goto_2
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    iget v6, v3, Landroid/app/Notification;->flags:I

    .line 128
    .line 129
    and-int/lit8 v6, v6, 0x10

    .line 130
    .line 131
    if-eqz v6, :cond_3

    .line 132
    .line 133
    move v6, v9

    .line 134
    goto :goto_3

    .line 135
    :cond_3
    move v6, v8

    .line 136
    :goto_3
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iget v6, v3, Landroid/app/Notification;->defaults:I

    .line 141
    .line 142
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    iget-object v6, v0, LD/m;->e:Ljava/lang/CharSequence;

    .line 147
    .line 148
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    iget-object v6, v0, LD/m;->f:Ljava/lang/CharSequence;

    .line 153
    .line 154
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-virtual {v5, v7}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    iget-object v6, v0, LD/m;->g:Landroid/app/PendingIntent;

    .line 163
    .line 164
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    iget-object v6, v3, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 169
    .line 170
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    iget-object v6, v0, LD/m;->h:Landroid/app/PendingIntent;

    .line 175
    .line 176
    iget v10, v3, Landroid/app/Notification;->flags:I

    .line 177
    .line 178
    and-int/lit16 v10, v10, 0x80

    .line 179
    .line 180
    if-eqz v10, :cond_4

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_4
    move v9, v8

    .line 184
    :goto_4
    invoke-virtual {v5, v6, v9}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    iget v6, v0, LD/m;->j:I

    .line 189
    .line 190
    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    invoke-virtual {v5, v8, v8, v8}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 195
    .line 196
    .line 197
    iget-object v5, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v5, Landroid/app/Notification$Builder;

    .line 200
    .line 201
    iget-object v6, v0, LD/m;->i:Landroidx/core/graphics/drawable/IconCompat;

    .line 202
    .line 203
    if-nez v6, :cond_5

    .line 204
    .line 205
    move-object v2, v7

    .line 206
    goto :goto_5

    .line 207
    :cond_5
    invoke-virtual {v6, v2}, Landroidx/core/graphics/drawable/IconCompat;->e(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    :goto_5
    invoke-virtual {v5, v2}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Notification$Builder;

    .line 212
    .line 213
    .line 214
    iget-object v2, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v2, Landroid/app/Notification$Builder;

    .line 217
    .line 218
    invoke-virtual {v2, v7}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-virtual {v2, v8}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    iget v5, v0, LD/m;->k:I

    .line 227
    .line 228
    invoke-virtual {v2, v5}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 229
    .line 230
    .line 231
    iget-object v2, v0, LD/m;->b:Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    move v6, v8

    .line 238
    :goto_6
    const/16 v10, 0x1c

    .line 239
    .line 240
    const/16 v11, 0x18

    .line 241
    .line 242
    const-string v12, "android.support.allowGeneratedReplies"

    .line 243
    .line 244
    const-string v13, ""

    .line 245
    .line 246
    if-ge v6, v5, :cond_f

    .line 247
    .line 248
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    add-int/lit8 v6, v6, 0x1

    .line 253
    .line 254
    check-cast v14, LD/g;

    .line 255
    .line 256
    iget-object v15, v14, LD/g;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 257
    .line 258
    if-nez v15, :cond_6

    .line 259
    .line 260
    iget v15, v14, LD/g;->f:I

    .line 261
    .line 262
    if-eqz v15, :cond_6

    .line 263
    .line 264
    invoke-static {v7, v13, v15}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    .line 265
    .line 266
    .line 267
    move-result-object v13

    .line 268
    iput-object v13, v14, LD/g;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 269
    .line 270
    :cond_6
    iget-object v13, v14, LD/g;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 271
    .line 272
    if-eqz v13, :cond_7

    .line 273
    .line 274
    invoke-virtual {v13, v7}, Landroidx/core/graphics/drawable/IconCompat;->e(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    .line 275
    .line 276
    .line 277
    move-result-object v13

    .line 278
    goto :goto_7

    .line 279
    :cond_7
    move-object v13, v7

    .line 280
    :goto_7
    new-instance v15, Landroid/app/Notification$Action$Builder;

    .line 281
    .line 282
    iget-object v4, v14, LD/g;->g:Ljava/lang/CharSequence;

    .line 283
    .line 284
    move-object/from16 v16, v7

    .line 285
    .line 286
    iget-object v7, v14, LD/g;->h:Landroid/app/PendingIntent;

    .line 287
    .line 288
    invoke-direct {v15, v13, v4, v7}, Landroid/app/Notification$Action$Builder;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 289
    .line 290
    .line 291
    iget-object v4, v14, LD/g;->c:[LD/y;

    .line 292
    .line 293
    if-eqz v4, :cond_9

    .line 294
    .line 295
    array-length v7, v4

    .line 296
    new-array v13, v7, [Landroid/app/RemoteInput;

    .line 297
    .line 298
    array-length v9, v4

    .line 299
    if-gtz v9, :cond_8

    .line 300
    .line 301
    move v4, v8

    .line 302
    :goto_8
    if-ge v4, v7, :cond_9

    .line 303
    .line 304
    aget-object v9, v13, v4

    .line 305
    .line 306
    invoke-virtual {v15, v9}, Landroid/app/Notification$Action$Builder;->addRemoteInput(Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    .line 307
    .line 308
    .line 309
    add-int/lit8 v4, v4, 0x1

    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_8
    aget-object v1, v4, v8

    .line 313
    .line 314
    new-instance v1, Landroid/app/RemoteInput$Builder;

    .line 315
    .line 316
    throw v16

    .line 317
    :cond_9
    iget-object v4, v14, LD/g;->a:Landroid/os/Bundle;

    .line 318
    .line 319
    if-eqz v4, :cond_a

    .line 320
    .line 321
    new-instance v7, Landroid/os/Bundle;

    .line 322
    .line 323
    invoke-direct {v7, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 324
    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_a
    new-instance v7, Landroid/os/Bundle;

    .line 328
    .line 329
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 330
    .line 331
    .line 332
    :goto_9
    iget-boolean v4, v14, LD/g;->d:Z

    .line 333
    .line 334
    invoke-virtual {v7, v12, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 335
    .line 336
    .line 337
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 338
    .line 339
    if-lt v9, v11, :cond_b

    .line 340
    .line 341
    invoke-static {v15, v4}, LD/o;->b(Landroid/app/Notification$Action$Builder;Z)V

    .line 342
    .line 343
    .line 344
    :cond_b
    const-string v4, "android.support.action.semanticAction"

    .line 345
    .line 346
    invoke-virtual {v7, v4, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 347
    .line 348
    .line 349
    if-lt v9, v10, :cond_c

    .line 350
    .line 351
    invoke-static {v15}, LD/q;->a(Landroid/app/Notification$Action$Builder;)V

    .line 352
    .line 353
    .line 354
    :cond_c
    const/16 v4, 0x1d

    .line 355
    .line 356
    if-lt v9, v4, :cond_d

    .line 357
    .line 358
    invoke-static {v15}, LD/d;->d(Landroid/app/Notification$Action$Builder;)V

    .line 359
    .line 360
    .line 361
    :cond_d
    const/16 v4, 0x1f

    .line 362
    .line 363
    if-lt v9, v4, :cond_e

    .line 364
    .line 365
    invoke-static {v15}, LD/r;->a(Landroid/app/Notification$Action$Builder;)V

    .line 366
    .line 367
    .line 368
    :cond_e
    const-string v4, "android.support.action.showsUserInterface"

    .line 369
    .line 370
    iget-boolean v9, v14, LD/g;->e:Z

    .line 371
    .line 372
    invoke-virtual {v7, v4, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v15, v7}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v15}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    iget-object v7, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v7, Landroid/app/Notification$Builder;

    .line 385
    .line 386
    invoke-virtual {v7, v4}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 387
    .line 388
    .line 389
    move-object/from16 v7, v16

    .line 390
    .line 391
    const/16 v4, 0x1a

    .line 392
    .line 393
    goto/16 :goto_6

    .line 394
    .line 395
    :cond_f
    move-object/from16 v16, v7

    .line 396
    .line 397
    iget-object v2, v0, LD/m;->q:Landroid/os/Bundle;

    .line 398
    .line 399
    if-eqz v2, :cond_10

    .line 400
    .line 401
    iget-object v4, v1, Ll1/g;->d:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v4, Landroid/os/Bundle;

    .line 404
    .line 405
    invoke-virtual {v4, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 406
    .line 407
    .line 408
    :cond_10
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 409
    .line 410
    iget-object v4, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v4, Landroid/app/Notification$Builder;

    .line 413
    .line 414
    iget-boolean v5, v0, LD/m;->l:Z

    .line 415
    .line 416
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 417
    .line 418
    .line 419
    iget-object v4, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v4, Landroid/app/Notification$Builder;

    .line 422
    .line 423
    iget-boolean v5, v0, LD/m;->o:Z

    .line 424
    .line 425
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    .line 426
    .line 427
    .line 428
    iget-object v4, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v4, Landroid/app/Notification$Builder;

    .line 431
    .line 432
    iget-object v5, v0, LD/m;->n:Ljava/lang/String;

    .line 433
    .line 434
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 435
    .line 436
    .line 437
    iget-object v4, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v4, Landroid/app/Notification$Builder;

    .line 440
    .line 441
    move-object/from16 v5, v16

    .line 442
    .line 443
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 444
    .line 445
    .line 446
    iget-object v4, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v4, Landroid/app/Notification$Builder;

    .line 449
    .line 450
    invoke-virtual {v4, v8}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    .line 451
    .line 452
    .line 453
    iget-object v4, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v4, Landroid/app/Notification$Builder;

    .line 456
    .line 457
    iget-object v5, v0, LD/m;->p:Ljava/lang/String;

    .line 458
    .line 459
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 460
    .line 461
    .line 462
    iget-object v4, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v4, Landroid/app/Notification$Builder;

    .line 465
    .line 466
    iget v5, v0, LD/m;->r:I

    .line 467
    .line 468
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setColor(I)Landroid/app/Notification$Builder;

    .line 469
    .line 470
    .line 471
    iget-object v4, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v4, Landroid/app/Notification$Builder;

    .line 474
    .line 475
    iget v5, v0, LD/m;->s:I

    .line 476
    .line 477
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setVisibility(I)Landroid/app/Notification$Builder;

    .line 478
    .line 479
    .line 480
    iget-object v4, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v4, Landroid/app/Notification$Builder;

    .line 483
    .line 484
    const/4 v5, 0x0

    .line 485
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setPublicVersion(Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 486
    .line 487
    .line 488
    iget-object v4, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v4, Landroid/app/Notification$Builder;

    .line 491
    .line 492
    iget-object v5, v3, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 493
    .line 494
    iget-object v3, v3, Landroid/app/Notification;->audioAttributes:Landroid/media/AudioAttributes;

    .line 495
    .line 496
    invoke-virtual {v4, v5, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)Landroid/app/Notification$Builder;

    .line 497
    .line 498
    .line 499
    iget-object v3, v0, LD/m;->x:Ljava/util/ArrayList;

    .line 500
    .line 501
    iget-object v4, v0, LD/m;->c:Ljava/util/ArrayList;

    .line 502
    .line 503
    if-ge v2, v10, :cond_15

    .line 504
    .line 505
    if-nez v4, :cond_11

    .line 506
    .line 507
    const/4 v2, 0x0

    .line 508
    goto :goto_a

    .line 509
    :cond_11
    new-instance v2, Ljava/util/ArrayList;

    .line 510
    .line 511
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 523
    .line 524
    .line 525
    move-result v6

    .line 526
    if-nez v6, :cond_14

    .line 527
    .line 528
    :goto_a
    if-nez v2, :cond_12

    .line 529
    .line 530
    goto :goto_b

    .line 531
    :cond_12
    if-nez v3, :cond_13

    .line 532
    .line 533
    move-object v3, v2

    .line 534
    goto :goto_b

    .line 535
    :cond_13
    new-instance v5, Ls/f;

    .line 536
    .line 537
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 538
    .line 539
    .line 540
    move-result v6

    .line 541
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 542
    .line 543
    .line 544
    move-result v7

    .line 545
    add-int/2addr v7, v6

    .line 546
    invoke-direct {v5, v7}, Ls/f;-><init>(I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v5, v2}, Ls/f;->addAll(Ljava/util/Collection;)Z

    .line 550
    .line 551
    .line 552
    invoke-virtual {v5, v3}, Ls/f;->addAll(Ljava/util/Collection;)Z

    .line 553
    .line 554
    .line 555
    new-instance v3, Ljava/util/ArrayList;

    .line 556
    .line 557
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 558
    .line 559
    .line 560
    goto :goto_b

    .line 561
    :cond_14
    invoke-static {v5}, LA0/a;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    throw v1

    .line 566
    :cond_15
    :goto_b
    if-eqz v3, :cond_16

    .line 567
    .line 568
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 569
    .line 570
    .line 571
    move-result v2

    .line 572
    if-nez v2, :cond_16

    .line 573
    .line 574
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 575
    .line 576
    .line 577
    move-result v2

    .line 578
    move v5, v8

    .line 579
    :goto_c
    if-ge v5, v2, :cond_16

    .line 580
    .line 581
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v6

    .line 585
    add-int/lit8 v5, v5, 0x1

    .line 586
    .line 587
    check-cast v6, Ljava/lang/String;

    .line 588
    .line 589
    iget-object v7, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast v7, Landroid/app/Notification$Builder;

    .line 592
    .line 593
    invoke-virtual {v7, v6}, Landroid/app/Notification$Builder;->addPerson(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 594
    .line 595
    .line 596
    goto :goto_c

    .line 597
    :cond_16
    iget-object v2, v0, LD/m;->d:Ljava/util/ArrayList;

    .line 598
    .line 599
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    if-lez v3, :cond_20

    .line 604
    .line 605
    iget-object v3, v0, LD/m;->q:Landroid/os/Bundle;

    .line 606
    .line 607
    if-nez v3, :cond_17

    .line 608
    .line 609
    new-instance v3, Landroid/os/Bundle;

    .line 610
    .line 611
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 612
    .line 613
    .line 614
    iput-object v3, v0, LD/m;->q:Landroid/os/Bundle;

    .line 615
    .line 616
    :cond_17
    iget-object v3, v0, LD/m;->q:Landroid/os/Bundle;

    .line 617
    .line 618
    const-string v5, "android.car.EXTENSIONS"

    .line 619
    .line 620
    invoke-virtual {v3, v5}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    if-nez v3, :cond_18

    .line 625
    .line 626
    new-instance v3, Landroid/os/Bundle;

    .line 627
    .line 628
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 629
    .line 630
    .line 631
    :cond_18
    new-instance v6, Landroid/os/Bundle;

    .line 632
    .line 633
    invoke-direct {v6, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 634
    .line 635
    .line 636
    new-instance v7, Landroid/os/Bundle;

    .line 637
    .line 638
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 639
    .line 640
    .line 641
    move v9, v8

    .line 642
    :goto_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 643
    .line 644
    .line 645
    move-result v14

    .line 646
    if-ge v9, v14, :cond_1e

    .line 647
    .line 648
    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v14

    .line 652
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v15

    .line 656
    check-cast v15, LD/g;

    .line 657
    .line 658
    new-instance v10, Landroid/os/Bundle;

    .line 659
    .line 660
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 661
    .line 662
    .line 663
    iget-object v11, v15, LD/g;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 664
    .line 665
    if-nez v11, :cond_19

    .line 666
    .line 667
    iget v11, v15, LD/g;->f:I

    .line 668
    .line 669
    if-eqz v11, :cond_19

    .line 670
    .line 671
    const/4 v8, 0x0

    .line 672
    invoke-static {v8, v13, v11}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    .line 673
    .line 674
    .line 675
    move-result-object v11

    .line 676
    iput-object v11, v15, LD/g;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 677
    .line 678
    :cond_19
    iget-object v8, v15, LD/g;->b:Landroidx/core/graphics/drawable/IconCompat;

    .line 679
    .line 680
    if-eqz v8, :cond_1a

    .line 681
    .line 682
    invoke-virtual {v8}, Landroidx/core/graphics/drawable/IconCompat;->c()I

    .line 683
    .line 684
    .line 685
    move-result v8

    .line 686
    goto :goto_e

    .line 687
    :cond_1a
    const/4 v8, 0x0

    .line 688
    :goto_e
    const-string v11, "icon"

    .line 689
    .line 690
    invoke-virtual {v10, v11, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 691
    .line 692
    .line 693
    const-string v8, "title"

    .line 694
    .line 695
    iget-object v11, v15, LD/g;->g:Ljava/lang/CharSequence;

    .line 696
    .line 697
    invoke-virtual {v10, v8, v11}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 698
    .line 699
    .line 700
    const-string v8, "actionIntent"

    .line 701
    .line 702
    iget-object v11, v15, LD/g;->h:Landroid/app/PendingIntent;

    .line 703
    .line 704
    invoke-virtual {v10, v8, v11}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 705
    .line 706
    .line 707
    iget-object v8, v15, LD/g;->a:Landroid/os/Bundle;

    .line 708
    .line 709
    if-eqz v8, :cond_1b

    .line 710
    .line 711
    new-instance v11, Landroid/os/Bundle;

    .line 712
    .line 713
    invoke-direct {v11, v8}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 714
    .line 715
    .line 716
    goto :goto_f

    .line 717
    :cond_1b
    new-instance v11, Landroid/os/Bundle;

    .line 718
    .line 719
    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 720
    .line 721
    .line 722
    :goto_f
    iget-boolean v8, v15, LD/g;->d:Z

    .line 723
    .line 724
    invoke-virtual {v11, v12, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 725
    .line 726
    .line 727
    const-string v8, "extras"

    .line 728
    .line 729
    invoke-virtual {v10, v8, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 730
    .line 731
    .line 732
    iget-object v8, v15, LD/g;->c:[LD/y;

    .line 733
    .line 734
    if-nez v8, :cond_1c

    .line 735
    .line 736
    move-object/from16 v17, v2

    .line 737
    .line 738
    const/4 v11, 0x0

    .line 739
    goto :goto_10

    .line 740
    :cond_1c
    array-length v11, v8

    .line 741
    new-array v11, v11, [Landroid/os/Bundle;

    .line 742
    .line 743
    move-object/from16 v17, v2

    .line 744
    .line 745
    array-length v2, v8

    .line 746
    if-gtz v2, :cond_1d

    .line 747
    .line 748
    :goto_10
    const-string v2, "remoteInputs"

    .line 749
    .line 750
    invoke-virtual {v10, v2, v11}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 751
    .line 752
    .line 753
    const-string v2, "showsUserInterface"

    .line 754
    .line 755
    iget-boolean v8, v15, LD/g;->e:Z

    .line 756
    .line 757
    invoke-virtual {v10, v2, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 758
    .line 759
    .line 760
    const-string v2, "semanticAction"

    .line 761
    .line 762
    const/4 v11, 0x0

    .line 763
    invoke-virtual {v10, v2, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v7, v14, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 767
    .line 768
    .line 769
    add-int/lit8 v9, v9, 0x1

    .line 770
    .line 771
    move v8, v11

    .line 772
    move-object/from16 v2, v17

    .line 773
    .line 774
    const/16 v10, 0x1c

    .line 775
    .line 776
    const/16 v11, 0x18

    .line 777
    .line 778
    goto/16 :goto_d

    .line 779
    .line 780
    :cond_1d
    const/4 v11, 0x0

    .line 781
    aget-object v1, v8, v11

    .line 782
    .line 783
    new-instance v1, Landroid/os/Bundle;

    .line 784
    .line 785
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 786
    .line 787
    .line 788
    const/16 v16, 0x0

    .line 789
    .line 790
    throw v16

    .line 791
    :cond_1e
    const-string v2, "invisible_actions"

    .line 792
    .line 793
    invoke-virtual {v3, v2, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v6, v2, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 797
    .line 798
    .line 799
    iget-object v2, v0, LD/m;->q:Landroid/os/Bundle;

    .line 800
    .line 801
    if-nez v2, :cond_1f

    .line 802
    .line 803
    new-instance v2, Landroid/os/Bundle;

    .line 804
    .line 805
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 806
    .line 807
    .line 808
    iput-object v2, v0, LD/m;->q:Landroid/os/Bundle;

    .line 809
    .line 810
    :cond_1f
    iget-object v2, v0, LD/m;->q:Landroid/os/Bundle;

    .line 811
    .line 812
    invoke-virtual {v2, v5, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 813
    .line 814
    .line 815
    iget-object v2, v1, Ll1/g;->d:Ljava/lang/Object;

    .line 816
    .line 817
    check-cast v2, Landroid/os/Bundle;

    .line 818
    .line 819
    invoke-virtual {v2, v5, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 820
    .line 821
    .line 822
    :cond_20
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 823
    .line 824
    const/16 v3, 0x18

    .line 825
    .line 826
    if-lt v2, v3, :cond_21

    .line 827
    .line 828
    iget-object v3, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 829
    .line 830
    check-cast v3, Landroid/app/Notification$Builder;

    .line 831
    .line 832
    iget-object v5, v0, LD/m;->q:Landroid/os/Bundle;

    .line 833
    .line 834
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 835
    .line 836
    .line 837
    iget-object v3, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 838
    .line 839
    check-cast v3, Landroid/app/Notification$Builder;

    .line 840
    .line 841
    invoke-static {v3}, LD/o;->c(Landroid/app/Notification$Builder;)V

    .line 842
    .line 843
    .line 844
    :cond_21
    const/16 v3, 0x1a

    .line 845
    .line 846
    if-lt v2, v3, :cond_22

    .line 847
    .line 848
    iget-object v3, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 849
    .line 850
    check-cast v3, Landroid/app/Notification$Builder;

    .line 851
    .line 852
    iget v5, v0, LD/m;->u:I

    .line 853
    .line 854
    invoke-static {v3, v5}, LD/p;->d(Landroid/app/Notification$Builder;I)V

    .line 855
    .line 856
    .line 857
    iget-object v3, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 858
    .line 859
    check-cast v3, Landroid/app/Notification$Builder;

    .line 860
    .line 861
    invoke-static {v3}, LD/p;->f(Landroid/app/Notification$Builder;)V

    .line 862
    .line 863
    .line 864
    iget-object v3, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast v3, Landroid/app/Notification$Builder;

    .line 867
    .line 868
    invoke-static {v3}, LD/p;->g(Landroid/app/Notification$Builder;)V

    .line 869
    .line 870
    .line 871
    iget-object v3, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 872
    .line 873
    check-cast v3, Landroid/app/Notification$Builder;

    .line 874
    .line 875
    invoke-static {v3}, LD/p;->h(Landroid/app/Notification$Builder;)V

    .line 876
    .line 877
    .line 878
    iget-object v3, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 879
    .line 880
    check-cast v3, Landroid/app/Notification$Builder;

    .line 881
    .line 882
    invoke-static {v3}, LD/p;->e(Landroid/app/Notification$Builder;)V

    .line 883
    .line 884
    .line 885
    iget-object v3, v0, LD/m;->t:Ljava/lang/String;

    .line 886
    .line 887
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 888
    .line 889
    .line 890
    move-result v3

    .line 891
    if-nez v3, :cond_22

    .line 892
    .line 893
    iget-object v3, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 894
    .line 895
    check-cast v3, Landroid/app/Notification$Builder;

    .line 896
    .line 897
    const/4 v5, 0x0

    .line 898
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 899
    .line 900
    .line 901
    move-result-object v3

    .line 902
    const/4 v11, 0x0

    .line 903
    invoke-virtual {v3, v11}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 904
    .line 905
    .line 906
    move-result-object v3

    .line 907
    invoke-virtual {v3, v11, v11, v11}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    .line 908
    .line 909
    .line 910
    move-result-object v3

    .line 911
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 912
    .line 913
    .line 914
    :cond_22
    const/16 v3, 0x1c

    .line 915
    .line 916
    if-lt v2, v3, :cond_23

    .line 917
    .line 918
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 919
    .line 920
    .line 921
    move-result-object v3

    .line 922
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 923
    .line 924
    .line 925
    move-result v4

    .line 926
    if-nez v4, :cond_24

    .line 927
    .line 928
    :cond_23
    const/16 v4, 0x1d

    .line 929
    .line 930
    goto :goto_11

    .line 931
    :cond_24
    invoke-static {v3}, LA0/a;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    throw v1

    .line 936
    :goto_11
    if-lt v2, v4, :cond_25

    .line 937
    .line 938
    iget-object v2, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 939
    .line 940
    check-cast v2, Landroid/app/Notification$Builder;

    .line 941
    .line 942
    iget-boolean v3, v0, LD/m;->v:Z

    .line 943
    .line 944
    invoke-static {v2, v3}, LD/d;->b(Landroid/app/Notification$Builder;Z)V

    .line 945
    .line 946
    .line 947
    iget-object v2, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 948
    .line 949
    check-cast v2, Landroid/app/Notification$Builder;

    .line 950
    .line 951
    invoke-static {v2}, LD/d;->c(Landroid/app/Notification$Builder;)V

    .line 952
    .line 953
    .line 954
    :cond_25
    iget-object v2, v1, Ll1/g;->c:Ljava/lang/Object;

    .line 955
    .line 956
    check-cast v2, LD/m;

    .line 957
    .line 958
    iget-object v3, v2, LD/m;->m:LD/n;

    .line 959
    .line 960
    if-eqz v3, :cond_26

    .line 961
    .line 962
    invoke-virtual {v3, v1}, LD/n;->W(Ll1/g;)V

    .line 963
    .line 964
    .line 965
    :cond_26
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 966
    .line 967
    iget-object v5, v1, Ll1/g;->b:Ljava/lang/Object;

    .line 968
    .line 969
    check-cast v5, Landroid/app/Notification$Builder;

    .line 970
    .line 971
    const/16 v6, 0x1a

    .line 972
    .line 973
    if-lt v4, v6, :cond_27

    .line 974
    .line 975
    invoke-virtual {v5}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    goto :goto_12

    .line 980
    :cond_27
    const/16 v6, 0x18

    .line 981
    .line 982
    if-lt v4, v6, :cond_28

    .line 983
    .line 984
    invoke-virtual {v5}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 985
    .line 986
    .line 987
    move-result-object v1

    .line 988
    goto :goto_12

    .line 989
    :cond_28
    iget-object v1, v1, Ll1/g;->d:Ljava/lang/Object;

    .line 990
    .line 991
    check-cast v1, Landroid/os/Bundle;

    .line 992
    .line 993
    invoke-virtual {v5, v1}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 994
    .line 995
    .line 996
    invoke-virtual {v5}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 997
    .line 998
    .line 999
    move-result-object v1

    .line 1000
    :goto_12
    if-eqz v3, :cond_29

    .line 1001
    .line 1002
    iget-object v2, v2, LD/m;->m:LD/n;

    .line 1003
    .line 1004
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1005
    .line 1006
    .line 1007
    :cond_29
    if-eqz v3, :cond_2a

    .line 1008
    .line 1009
    iget-object v2, v1, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 1010
    .line 1011
    if-eqz v2, :cond_2a

    .line 1012
    .line 1013
    invoke-virtual {v3}, LD/n;->Y()Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v3

    .line 1017
    if-eqz v3, :cond_2a

    .line 1018
    .line 1019
    const-string v4, "androidx.core.app.extra.COMPAT_TEMPLATE"

    .line 1020
    .line 1021
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1022
    .line 1023
    .line 1024
    :cond_2a
    return-object v1
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
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
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

.method public final c(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/m;->w:Landroid/app/Notification;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget p2, v0, Landroid/app/Notification;->flags:I

    .line 6
    .line 7
    or-int/2addr p1, p2

    .line 8
    iput p1, v0, Landroid/app/Notification;->flags:I

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget p2, v0, Landroid/app/Notification;->flags:I

    .line 12
    .line 13
    not-int p1, p1

    .line 14
    and-int/2addr p1, p2

    .line 15
    iput p1, v0, Landroid/app/Notification;->flags:I

    .line 16
    .line 17
    return-void
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
.end method

.method public final d(Landroid/graphics/Bitmap;)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_1

    .line 5
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1b

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-lt v0, v1, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iget-object v0, p0, LD/m;->a:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const v1, 0x7f070080

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const v3, 0x7f07007f

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-gt v3, v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-gt v3, v0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    int-to-double v3, v1

    .line 47
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    int-to-double v5, v1

    .line 56
    div-double/2addr v3, v5

    .line 57
    int-to-double v0, v0

    .line 58
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    int-to-double v5, v5

    .line 67
    div-double/2addr v0, v5

    .line 68
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    int-to-double v3, v3

    .line 77
    mul-double/2addr v3, v0

    .line 78
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    double-to-int v3, v3

    .line 83
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    int-to-double v4, v4

    .line 88
    mul-double/2addr v4, v0

    .line 89
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    double-to-int v0, v0

    .line 94
    invoke-static {p1, v3, v0, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :goto_0
    sget-object v0, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    .line 104
    .line 105
    invoke-direct {v0, v2}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    .line 106
    .line 107
    .line 108
    iput-object p1, v0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    .line 109
    .line 110
    move-object p1, v0

    .line 111
    :goto_1
    iput-object p1, p0, LD/m;->i:Landroidx/core/graphics/drawable/IconCompat;

    .line 112
    .line 113
    return-void
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
.end method

.method public final e(LD/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD/m;->m:LD/n;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LD/m;->m:LD/n;

    .line 6
    .line 7
    iget-object v0, p1, LD/n;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LD/m;

    .line 10
    .line 11
    if-eq v0, p0, :cond_0

    .line 12
    .line 13
    iput-object p0, p1, LD/n;->a:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, LD/m;->e(LD/n;)V

    .line 16
    .line 17
    .line 18
    :cond_0
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
