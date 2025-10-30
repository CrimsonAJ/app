.class public abstract Lv3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;

.field public static final c:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "Camera:MicroVideo"

    .line 2
    .line 3
    const-string v1, "GCamera:MicroVideo"

    .line 4
    .line 5
    const-string v2, "Camera:MotionPhoto"

    .line 6
    .line 7
    const-string v3, "GCamera:MotionPhoto"

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lv3/d;->a:[Ljava/lang/String;

    .line 14
    .line 15
    const-string v0, "Camera:MicroVideoPresentationTimestampUs"

    .line 16
    .line 17
    const-string v1, "GCamera:MicroVideoPresentationTimestampUs"

    .line 18
    .line 19
    const-string v2, "Camera:MotionPhotoPresentationTimestampUs"

    .line 20
    .line 21
    const-string v3, "GCamera:MotionPhotoPresentationTimestampUs"

    .line 22
    .line 23
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lv3/d;->b:[Ljava/lang/String;

    .line 28
    .line 29
    const-string v0, "Camera:MicroVideoOffset"

    .line 30
    .line 31
    const-string v1, "GCamera:MicroVideoOffset"

    .line 32
    .line 33
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lv3/d;->c:[Ljava/lang/String;

    .line 38
    .line 39
    return-void
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

.method public static a(Ljava/lang/String;)LY3/e;
    .locals 20

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Ljava/io/StringReader;

    .line 11
    .line 12
    move-object/from16 v3, p0

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 21
    .line 22
    .line 23
    const-string v2, "x:xmpmeta"

    .line 24
    .line 25
    invoke-static {v1, v2}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v3, :cond_c

    .line 31
    .line 32
    sget-object v3, LP5/F;->b:LP5/D;

    .line 33
    .line 34
    sget-object v3, LP5/S;->e:LP5/S;

    .line 35
    .line 36
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    move-wide v7, v5

    .line 42
    :cond_0
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 43
    .line 44
    .line 45
    const-string v9, "rdf:Description"

    .line 46
    .line 47
    invoke-static {v1, v9}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    if-eqz v9, :cond_7

    .line 52
    .line 53
    sget-object v3, Lv3/d;->a:[Ljava/lang/String;

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    move v8, v7

    .line 57
    :goto_0
    const/4 v9, 0x4

    .line 58
    if-ge v8, v9, :cond_a

    .line 59
    .line 60
    aget-object v10, v3, v8

    .line 61
    .line 62
    invoke-static {v1, v10}, Ll4/a;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    if-eqz v10, :cond_6

    .line 67
    .line 68
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-ne v3, v0, :cond_a

    .line 73
    .line 74
    sget-object v3, Lv3/d;->b:[Ljava/lang/String;

    .line 75
    .line 76
    move v8, v7

    .line 77
    :goto_1
    if-ge v8, v9, :cond_1

    .line 78
    .line 79
    aget-object v10, v3, v8

    .line 80
    .line 81
    invoke-static {v1, v10}, Ll4/a;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    if-eqz v10, :cond_2

    .line 86
    .line 87
    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v8

    .line 91
    const-wide/16 v10, -0x1

    .line 92
    .line 93
    cmp-long v3, v8, v10

    .line 94
    .line 95
    if-nez v3, :cond_3

    .line 96
    .line 97
    :cond_1
    move-wide v8, v5

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    add-int/2addr v8, v0

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    :goto_2
    sget-object v3, Lv3/d;->c:[Ljava/lang/String;

    .line 102
    .line 103
    :goto_3
    const/4 v10, 0x2

    .line 104
    if-ge v7, v10, :cond_5

    .line 105
    .line 106
    aget-object v10, v3, v7

    .line 107
    .line 108
    invoke-static {v1, v10}, Ll4/a;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    if-eqz v10, :cond_4

    .line 113
    .line 114
    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v12

    .line 118
    new-instance v14, Lv3/b;

    .line 119
    .line 120
    const-wide/16 v15, 0x0

    .line 121
    .line 122
    const-wide/16 v18, 0x0

    .line 123
    .line 124
    const-string v17, "image/jpeg"

    .line 125
    .line 126
    invoke-direct/range {v14 .. v19}, Lv3/b;-><init>(JLjava/lang/String;J)V

    .line 127
    .line 128
    .line 129
    move-object v3, v14

    .line 130
    new-instance v11, Lv3/b;

    .line 131
    .line 132
    const-string v14, "video/mp4"

    .line 133
    .line 134
    invoke-direct/range {v11 .. v16}, Lv3/b;-><init>(JLjava/lang/String;J)V

    .line 135
    .line 136
    .line 137
    invoke-static {v3, v11}, LP5/F;->t(Ljava/lang/Object;Ljava/lang/Object;)LP5/S;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    goto :goto_4

    .line 142
    :cond_4
    add-int/2addr v7, v0

    .line 143
    goto :goto_3

    .line 144
    :cond_5
    sget-object v3, LP5/F;->b:LP5/D;

    .line 145
    .line 146
    sget-object v3, LP5/S;->e:LP5/S;

    .line 147
    .line 148
    :goto_4
    move-wide v7, v8

    .line 149
    goto :goto_5

    .line 150
    :cond_6
    add-int/2addr v8, v0

    .line 151
    goto :goto_0

    .line 152
    :cond_7
    const-string v9, "Container:Directory"

    .line 153
    .line 154
    invoke-static {v1, v9}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    if-eqz v9, :cond_8

    .line 159
    .line 160
    const-string v3, "Container"

    .line 161
    .line 162
    const-string v9, "Item"

    .line 163
    .line 164
    invoke-static {v1, v3, v9}, Lv3/d;->b(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)LP5/S;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    goto :goto_5

    .line 169
    :cond_8
    const-string v9, "GContainer:Directory"

    .line 170
    .line 171
    invoke-static {v1, v9}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    if-eqz v9, :cond_9

    .line 176
    .line 177
    const-string v3, "GContainer"

    .line 178
    .line 179
    const-string v9, "GContainerItem"

    .line 180
    .line 181
    invoke-static {v1, v3, v9}, Lv3/d;->b(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)LP5/S;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    :cond_9
    :goto_5
    invoke-static {v1, v2}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    move-result v9

    .line 189
    if-eqz v9, :cond_0

    .line 190
    .line 191
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_b

    .line 196
    .line 197
    :cond_a
    return-object v4

    .line 198
    :cond_b
    new-instance v0, LY3/e;

    .line 199
    .line 200
    invoke-direct {v0, v7, v8, v3}, LY3/e;-><init>(JLP5/S;)V

    .line 201
    .line 202
    .line 203
    return-object v0

    .line 204
    :cond_c
    const-string v0, "Couldn\'t find xmp metadata"

    .line 205
    .line 206
    invoke-static {v0, v4}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    throw v0
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

.method public static b(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)LP5/S;
    .locals 13

    .line 1
    sget-object v0, LP5/F;->b:LP5/D;

    .line 2
    .line 3
    const-string v0, "initialCapacity"

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-static {v1, v0}, LP5/q;->c(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-array v0, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const-string v1, ":Item"

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, ":Directory"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v2, 0x0

    .line 24
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v1}, Ll4/a;->E(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_6

    .line 32
    .line 33
    const-string v3, ":Mime"

    .line 34
    .line 35
    invoke-virtual {p2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const-string v4, ":Semantic"

    .line 40
    .line 41
    invoke-virtual {p2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const-string v5, ":Length"

    .line 46
    .line 47
    invoke-virtual {p2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const-string v6, ":Padding"

    .line 52
    .line 53
    invoke-virtual {p2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-static {p0, v3}, Ll4/a;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    invoke-static {p0, v4}, Ll4/a;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {p0, v5}, Ll4/a;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-static {p0, v6}, Ll4/a;->y(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    if-eqz v10, :cond_5

    .line 74
    .line 75
    if-nez v3, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    new-instance v7, Lv3/b;

    .line 79
    .line 80
    const-wide/16 v8, 0x0

    .line 81
    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 85
    .line 86
    .line 87
    move-result-wide v3

    .line 88
    goto :goto_0

    .line 89
    :cond_2
    move-wide v3, v8

    .line 90
    :goto_0
    if-eqz v5, :cond_3

    .line 91
    .line 92
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 93
    .line 94
    .line 95
    move-result-wide v8

    .line 96
    :cond_3
    move-wide v11, v8

    .line 97
    move-wide v8, v3

    .line 98
    invoke-direct/range {v7 .. v12}, Lv3/b;-><init>(JLjava/lang/String;J)V

    .line 99
    .line 100
    .line 101
    add-int/lit8 v3, v2, 0x1

    .line 102
    .line 103
    array-length v4, v0

    .line 104
    if-ge v4, v3, :cond_4

    .line 105
    .line 106
    array-length v4, v0

    .line 107
    invoke-static {v4, v3}, LP5/C;->e(II)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :cond_4
    aput-object v7, v0, v2

    .line 116
    .line 117
    move v2, v3

    .line 118
    goto :goto_2

    .line 119
    :cond_5
    :goto_1
    sget-object p0, LP5/S;->e:LP5/S;

    .line 120
    .line 121
    return-object p0

    .line 122
    :cond_6
    :goto_2
    invoke-static {p0, p1}, Ll4/a;->D(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_0

    .line 127
    .line 128
    invoke-static {v2, v0}, LP5/F;->k(I[Ljava/lang/Object;)LP5/S;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0
    .line 133
    .line 134
    .line 135
    .line 136
.end method
