.class public final Lco/notix/wa;
.super Lco/notix/xa;
.source "SourceFile"


# static fields
.field public static final b:Lco/notix/wa;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/notix/wa;

    invoke-direct {v0}, Lco/notix/wa;-><init>()V

    sput-object v0, Lco/notix/wa;->b:Lco/notix/wa;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-string v0, "Uninitialized"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lco/notix/xa;-><init>(Ljava/lang/String;I)V

    return-void
.end method
