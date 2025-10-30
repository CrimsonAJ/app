.class public final synthetic Lj3/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/i;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(IIZ)V
    .locals 0

    .line 1
    iput p2, p0, Lj3/y;->a:I

    iput-boolean p3, p0, Lj3/y;->b:Z

    iput p1, p0, Lj3/y;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lj3/y;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lj3/y;->c:I

    iput-boolean p2, p0, Lj3/y;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lj3/y;->a:I

    .line 2
    .line 3
    check-cast p1, Lj3/p0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lj3/y;->b:Z

    .line 9
    .line 10
    iget v1, p0, Lj3/y;->c:I

    .line 11
    .line 12
    invoke-interface {p1, v1, v0}, Lj3/p0;->s(IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-boolean v0, p0, Lj3/y;->b:Z

    .line 17
    .line 18
    iget v1, p0, Lj3/y;->c:I

    .line 19
    .line 20
    invoke-interface {p1, v1, v0}, Lj3/p0;->q(IZ)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget v0, p0, Lj3/y;->c:I

    .line 25
    .line 26
    iget-boolean v1, p0, Lj3/y;->b:Z

    .line 27
    .line 28
    invoke-interface {p1, v0, v1}, Lj3/p0;->M(IZ)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
