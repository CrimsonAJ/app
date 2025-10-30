.class public final LQ2/p;
.super LF0/S;
.source "SourceFile"


# instance fields
.field public final d:Ljava/util/ArrayList;

.field public e:LO/a;

.field public final f:Lcom/google/android/gms/cast/MediaTrack;

.field public g:Lcom/google/android/gms/cast/MediaTrack;

.field public final synthetic h:LQ2/D;


# direct methods
.method public constructor <init>(LQ2/D;)V
    .locals 11

    .line 1
    iput-object p1, p0, LQ2/p;->h:LQ2/D;

    .line 2
    .line 3
    invoke-direct {p0}, LF0/S;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LQ2/p;->d:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v0, Lcom/google/android/gms/cast/MediaTrack;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    const-wide/16 v1, -0x1

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/cast/MediaTrack;-><init>(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lorg/json/JSONObject;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LQ2/p;->f:Lcom/google/android/gms/cast/MediaTrack;

    .line 29
    .line 30
    iput-object v0, p0, LQ2/p;->g:Lcom/google/android/gms/cast/MediaTrack;

    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, LQ2/p;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final g(LF0/r0;I)V
    .locals 9

    .line 1
    check-cast p1, LQ2/x;

    .line 2
    .line 3
    iget-object v0, p0, LQ2/p;->d:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    check-cast p2, Lcom/google/android/gms/cast/MediaTrack;

    .line 10
    .line 11
    iget-wide v0, p2, Lcom/google/android/gms/cast/MediaTrack;->a:J

    .line 12
    .line 13
    const-wide/16 v2, -0x1

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    iget-object v1, p1, LQ2/x;->v:Landroid/view/View;

    .line 18
    .line 19
    iget-object v4, p1, LQ2/x;->u:Landroid/widget/TextView;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x1

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v0, p2, Lcom/google/android/gms/cast/MediaTrack;->e:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, LQ2/p;->g:Lcom/google/android/gms/cast/MediaTrack;

    .line 31
    .line 32
    iget-wide v2, v0, Lcom/google/android/gms/cast/MediaTrack;->a:J

    .line 33
    .line 34
    iget-wide v7, p2, Lcom/google/android/gms/cast/MediaTrack;->a:J

    .line 35
    .line 36
    cmp-long p2, v7, v2

    .line 37
    .line 38
    if-nez p2, :cond_0

    .line 39
    .line 40
    move p2, v6

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move p2, v5

    .line 43
    :goto_0
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, LQ2/p;->g:Lcom/google/android/gms/cast/MediaTrack;

    .line 47
    .line 48
    iget-wide v2, p2, Lcom/google/android/gms/cast/MediaTrack;->a:J

    .line 49
    .line 50
    cmp-long p2, v7, v2

    .line 51
    .line 52
    if-nez p2, :cond_1

    .line 53
    .line 54
    move v5, v6

    .line 55
    :cond_1
    invoke-virtual {v1, v5}, Landroid/view/View;->setSelected(Z)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const p2, 0x7f1400a6

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setText(I)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, LQ2/p;->g:Lcom/google/android/gms/cast/MediaTrack;

    .line 66
    .line 67
    iget-wide v7, p2, Lcom/google/android/gms/cast/MediaTrack;->a:J

    .line 68
    .line 69
    cmp-long p2, v7, v2

    .line 70
    .line 71
    if-nez p2, :cond_3

    .line 72
    .line 73
    move p2, v6

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move p2, v5

    .line 76
    :goto_1
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 77
    .line 78
    .line 79
    iget-object p2, p0, LQ2/p;->g:Lcom/google/android/gms/cast/MediaTrack;

    .line 80
    .line 81
    iget-wide v7, p2, Lcom/google/android/gms/cast/MediaTrack;->a:J

    .line 82
    .line 83
    cmp-long p2, v7, v2

    .line 84
    .line 85
    if-nez p2, :cond_4

    .line 86
    .line 87
    move v5, v6

    .line 88
    :cond_4
    invoke-virtual {v1, v5}, Landroid/view/View;->setSelected(Z)V

    .line 89
    .line 90
    .line 91
    :goto_2
    new-instance p2, LI5/k;

    .line 92
    .line 93
    const/4 v0, 0x1

    .line 94
    invoke-direct {p2, p0, v0, p1}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p1, LF0/r0;->a:Landroid/view/View;

    .line 98
    .line 99
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    .line 101
    .line 102
    return-void
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

.method public final h(Landroid/view/ViewGroup;I)LF0/r0;
    .locals 2

    .line 1
    iget-object p2, p0, LQ2/p;->h:LQ2/D;

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const v0, 0x7f0d0046

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance p2, LQ2/x;

    .line 20
    .line 21
    invoke-direct {p2, p1}, LQ2/x;-><init>(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    return-object p2
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
