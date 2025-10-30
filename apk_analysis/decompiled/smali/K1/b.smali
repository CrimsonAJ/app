.class public final LK1/b;
.super Li8/N;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Li8/N;

.field public c:Lx8/C;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li8/N;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LK1/b;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LK1/b;->b:Li8/N;

    .line 3
    new-instance v0, Li8/c;

    .line 4
    invoke-virtual {p1}, Li8/N;->g()Lx8/i;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Li8/c;-><init>(LK1/b;Lx8/i;)V

    .line 5
    invoke-static {v0}, Lv4/e;->b(Lx8/I;)Lx8/C;

    move-result-object p1

    iput-object p1, p0, LK1/b;->c:Lx8/C;

    return-void
.end method

.method public constructor <init>(Li8/N;Lq2/u;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LK1/b;->a:I

    const-string v0, "responseBody"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LK1/b;->b:Li8/N;

    iput-object p2, p0, LK1/b;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget v0, p0, LK1/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK1/b;->b:Li8/N;

    .line 7
    .line 8
    invoke-virtual {v0}, Li8/N;->a()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0

    .line 13
    :pswitch_0
    iget-object v0, p0, LK1/b;->b:Li8/N;

    .line 14
    .line 15
    invoke-virtual {v0}, Li8/N;->a()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public close()V
    .locals 1

    .line 1
    iget v0, p0, LK1/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Li8/N;->close()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, LK1/b;->b:Li8/N;

    .line 11
    .line 12
    invoke-virtual {v0}, Li8/N;->close()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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

.method public final d()Li8/A;
    .locals 1

    .line 1
    iget v0, p0, LK1/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK1/b;->b:Li8/N;

    .line 7
    .line 8
    invoke-virtual {v0}, Li8/N;->d()Li8/A;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object v0, p0, LK1/b;->b:Li8/N;

    .line 14
    .line 15
    invoke-virtual {v0}, Li8/N;->d()Li8/A;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final g()Lx8/i;
    .locals 2

    .line 1
    iget v0, p0, LK1/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK1/b;->c:Lx8/C;

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    iget-object v0, p0, LK1/b;->c:Lx8/C;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LK1/b;->b:Li8/N;

    .line 14
    .line 15
    invoke-virtual {v0}, Li8/N;->g()Lx8/i;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, LK1/a;

    .line 20
    .line 21
    invoke-direct {v1, p0, v0}, LK1/a;-><init>(LK1/b;Lx8/i;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lv4/e;->b(Lx8/I;)Lx8/C;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, LK1/b;->c:Lx8/C;

    .line 29
    .line 30
    :cond_0
    return-object v0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 32
.end method
