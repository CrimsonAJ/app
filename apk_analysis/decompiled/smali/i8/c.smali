.class public final Li8/c;
.super Lx8/p;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LK1/b;Lx8/i;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Li8/c;->b:I

    .line 2
    iput-object p1, p0, Li8/c;->c:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lx8/p;-><init>(Lx8/I;)V

    return-void
.end method

.method public synthetic constructor <init>(Lx8/I;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Li8/c;->b:I

    invoke-direct {p0, p1}, Lx8/p;-><init>(Lx8/I;)V

    return-void
.end method

.method public constructor <init>(Lx8/I;Li8/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li8/c;->b:I

    iput-object p2, p0, Li8/c;->c:Ljava/lang/Object;

    .line 3
    invoke-direct {p0, p1}, Lx8/p;-><init>(Lx8/I;)V

    return-void
.end method


# virtual methods
.method public b0(Lx8/g;J)J
    .locals 1

    .line 1
    iget v0, p0, Li8/c;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lx8/p;->b0(Lx8/g;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    return-wide p1

    .line 11
    :pswitch_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lx8/p;->b0(Lx8/g;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-wide p1

    .line 16
    :catch_0
    move-exception p1

    .line 17
    iget-object p2, p0, Li8/c;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p2, LK1/b;

    .line 20
    .line 21
    iput-object p1, p2, LK1/b;->d:Ljava/lang/Object;

    .line 22
    .line 23
    throw p1

    .line 24
    :pswitch_1
    :try_start_1
    invoke-super {p0, p1, p2, p3}, Lx8/p;->b0(Lx8/g;J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 28
    return-wide p1

    .line 29
    :catch_1
    move-exception p1

    .line 30
    iput-object p1, p0, Li8/c;->c:Ljava/lang/Object;

    .line 31
    .line 32
    throw p1

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public close()V
    .locals 1

    .line 1
    iget v0, p0, Li8/c;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lx8/p;->close()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, Li8/c;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Li8/d;

    .line 13
    .line 14
    iget-object v0, v0, Li8/d;->a:Ll8/e;

    .line 15
    .line 16
    invoke-virtual {v0}, Ll8/e;->close()V

    .line 17
    .line 18
    .line 19
    invoke-super {p0}, Lx8/p;->close()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
